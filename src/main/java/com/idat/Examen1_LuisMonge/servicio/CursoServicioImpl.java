package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Examen1_LuisMonge.modelo.Curso;
import com.idat.Examen1_LuisMonge.repositorio.CursoRepositorio;


@Service
public class CursoServicioImpl implements CursoServicio {
	
	@Autowired
	public CursoRepositorio repositorio;

	@Override
	public void guardarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.save(curso);

	}

	@Override
	public void editarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(curso);

	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Curso obtenerCursorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
