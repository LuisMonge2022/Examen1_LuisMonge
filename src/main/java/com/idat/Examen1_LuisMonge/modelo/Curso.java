package com.idat.Examen1_LuisMonge.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name= "Curso")
@Entity
public class Curso implements Serializable{
	
	
	private static final long serialVersionUID = -4639710386706428784L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;	
	private String curso;
	private String descripcion;
	private Integer IdMalla;
	
	@ManyToMany(mappedBy = "curso", cascade = {CascadeType.PERSIST,CascadeType.MERGE})	
	private List<Profesor> profesor = new ArrayList<Profesor>();
	
	
	@OneToMany(mappedBy = "curso")
	private List<MallaCurricular> items = new ArrayList<MallaCurricular>();
	
	
	
	public Curso() {
		super();		
	}	
		
	public Curso(Integer idCurso, String curso, String descripcion, Integer idMalla) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		IdMalla = idMalla;
	}

	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdMalla() {
		return IdMalla;
	}
	public void setIdMalla(Integer idMalla) {
		IdMalla = idMalla;
	}
	
	
	
	
	
	

}
