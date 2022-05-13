package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import com.idat.Examen1_LuisMonge.modelo.Curso;

public interface CursoServicio {
	
	public void guardarCurso(Curso curso);
	public void editarCurso(Curso curso);
	public void eliminarCurso(Integer id);
	public List<Curso> listarCurso();
	public Curso obtenerCursorId(Integer id);

}
