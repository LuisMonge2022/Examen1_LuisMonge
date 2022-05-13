package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import com.idat.Examen1_LuisMonge.modelo.Universidad;

public interface UniversidadServicio {
	
	public void guardarUniversidad(Universidad universidad);
	public void editarUniversidad(Universidad universidad);
	public void eliminarUniversidad(Integer id);
	public List<Universidad> listarUniversidad();
	public Universidad obtenerUniversidadId(Integer id);

}
