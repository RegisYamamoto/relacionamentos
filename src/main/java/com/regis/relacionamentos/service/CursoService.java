package com.regis.relacionamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.relacionamentos.model.Curso;
import com.regis.relacionamentos.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public void salvarCurso(Curso curso) {
		cursoRepository.save(curso);
	}
	
}