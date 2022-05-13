package com.idat.Examen1_LuisMonge.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name= "Universidad")
@Entity
public class Universidad implements Serializable{

	
	private static final long serialVersionUID = -7953836624195575062L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUniversidad;	
	private String universidad;	
	
	@OneToOne(mappedBy = "universidad")
	private MallaCurricular mallacurricular;	
	
	
		
	public Universidad() {
		super();		
	}
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public Universidad(Integer idUniversidad, String universidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
	}	
	

}
