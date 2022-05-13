package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Examen1_LuisMonge.modelo.MallaCurricular;
import com.idat.Examen1_LuisMonge.repositorio.MallaCurricularRepositorio;


@Service
public class MallaCurricularServicioImpl implements MallaCurricularServicio {
	
	
	@Autowired
	public MallaCurricularRepositorio repositorio;

	@Override
	public void guardarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.save(mallacurricular);

	}

	@Override
	public void editarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(mallacurricular);

	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<MallaCurricular> listarMallaCurricular() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
