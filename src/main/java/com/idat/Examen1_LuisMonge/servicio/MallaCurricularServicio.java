package com.idat.Examen1_LuisMonge.servicio;

import java.util.List;

import com.idat.Examen1_LuisMonge.modelo.MallaCurricular;
import com.idat.Examen1_LuisMonge.modelo.Profesor;

public interface MallaCurricularServicio {
	
	public void guardarMallaCurricular(MallaCurricular mallacurricular);
	public void editarMallaCurricular(MallaCurricular mallacurricular);
	public void eliminarMallaCurricular(Integer id);
	public List<MallaCurricular> listarMallaCurricular();
	public MallaCurricular obtenerMallaCurricularId(Integer id);

}
