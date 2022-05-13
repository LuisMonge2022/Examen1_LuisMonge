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

import com.idat.Examen1_LuisMonge.modelo.Universidad;
import com.idat.Examen1_LuisMonge.servicio.UniversidadServicio;

@RestController
@RequestMapping("/universidad/v1")
public class UniversidadControlador {
	
	@Autowired
	private UniversidadServicio servicio;
	
	@RequestMapping(path = "/listar",method = RequestMethod.GET )
	public ResponseEntity<List<Universidad>> listarUniversidad(){
		
		return new ResponseEntity<List<Universidad>>(servicio.listarUniversidad(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Universidad universidad){
		
		servicio.guardarUniversidad(universidad);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Universidad> listarPorId(@PathVariable Integer id){
		
		Universidad u = servicio.obtenerUniversidadId(id);
		if(u != null)
			return new ResponseEntity<Universidad>(u, HttpStatus.OK);
		
		return new ResponseEntity<Universidad>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Universidad universidad){
		
		Universidad u = servicio.obtenerUniversidadId(universidad.getIdUniversidad());
		
		if(u != null) {
			servicio.editarUniversidad(universidad);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Universidad u = servicio.obtenerUniversidadId(id);
		if (u != null) {
			servicio.eliminarUniversidad(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	

}
