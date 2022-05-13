package com.idat.Examen1_LuisMonge.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Examen1_LuisMonge.modelo.MallaCurricular;
import com.idat.Examen1_LuisMonge.servicio.MallaCurricularServicio;

@RestController
@RequestMapping("/mallacurricular/v1")
public class MallaCurricularControlador {
	
	@Autowired
	private MallaCurricularServicio servicio;
	
	
	@RequestMapping(path = "/listar",method = RequestMethod.GET )
	public ResponseEntity<List<MallaCurricular>> listarProfesor(){
		
		return new ResponseEntity<List<MallaCurricular>>(servicio.listarMallaCurricular(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCurricular mallacurricular){
		
		servicio.guardarMallaCurricular(mallacurricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<MallaCurricular> listarPorId(@PathVariable Integer id){
		
		MallaCurricular m = servicio.obtenerMallaCurricularId(id);
		if(m != null)
			return new ResponseEntity<MallaCurricular>(m, HttpStatus.OK);
		
		return new ResponseEntity<MallaCurricular>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody MallaCurricular mallacurricular){
		
		MallaCurricular m = servicio.obtenerMallaCurricularId(mallacurricular.getIdMalla());
		
		if(m != null) {
			servicio.editarMallaCurricular(mallacurricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		MallaCurricular m = servicio.obtenerMallaCurricularId(id);
		if (m != null) {
			servicio.eliminarMallaCurricular(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}

}
