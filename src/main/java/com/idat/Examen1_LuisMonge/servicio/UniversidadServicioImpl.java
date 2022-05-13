package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Examen1_LuisMonge.modelo.Universidad;
import com.idat.Examen1_LuisMonge.repositorio.UniversidadRepositorio;


@Service
public class UniversidadServicioImpl implements UniversidadServicio {
	
	
	@Autowired
	public UniversidadRepositorio repositorio;

	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.save(universidad);

	}

	@Override
	public void editarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(universidad);

	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
