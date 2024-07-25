package com.udemy.app.usuario.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.app.usuario.models.entity.Alumno;
import com.udemy.app.usuario.models.repository.AlumnoRepository;
import com.udemy.app.usuario.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {
		return repository.findById(id);
	}

	@Transactional
	public Alumno save(Alumno alumno) {
		return repository.save(alumno);
	}

	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
