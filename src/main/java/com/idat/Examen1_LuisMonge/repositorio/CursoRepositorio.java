package com.idat.Examen1_LuisMonge.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Examen1_LuisMonge.modelo.Curso;


@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Integer> {

}
