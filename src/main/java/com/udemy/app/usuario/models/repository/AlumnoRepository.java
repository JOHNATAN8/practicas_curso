package com.udemy.app.usuario.models.repository;


import org.springframework.data.repository.CrudRepository;
import com.udemy.app.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

	

}
