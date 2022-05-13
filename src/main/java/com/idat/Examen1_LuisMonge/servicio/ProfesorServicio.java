package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import com.idat.Examen1_LuisMonge.dto.ProfesorDTORequest;
import com.idat.Examen1_LuisMonge.dto.ProfesorDTOResponse;

public interface ProfesorServicio {
	
	public void guardarProfesor(ProfesorDTORequest profesor);
	public void editarProfesor(ProfesorDTORequest profesor);
	
	public void eliminarProfesor(Integer id);
	
	public List<ProfesorDTOResponse> listarProfesor();
	public ProfesorDTOResponse obtenerProfesorId(Integer id);
	

}
