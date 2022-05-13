package com.idat.Examen1_LuisMonge.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name= "Mallacurricular")
@Entity
public class MallaCurricular implements Serializable{	
	
	
	private static final long serialVersionUID = 427145442356427712L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;	
	private String año;	
	
	@JoinColumn(name = "id_curso",nullable = false, unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_curso) references Curso (id_curso)"))
	@ManyToOne
	private Curso curso;
	
	
	@OneToOne
	@JoinColumn(name = "id_universidad", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = 
	"foreign key(id_universidad) references Universidad(id_universidad)"))
	private Universidad universidad;
	
	
	public MallaCurricular() {
		super();		
	}
	public MallaCurricular(Integer idMalla, String año) {
		super();
		this.idMalla = idMalla;
		this.año = año;
	}
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	
	
	

}
