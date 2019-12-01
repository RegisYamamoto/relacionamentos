package com.regis.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamentos.model.Curso;
import com.regis.relacionamentos.service.CursoService;

@RestController
@RequestMapping(value = "cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@PostMapping(value = "")
	public void salvarCurso(@RequestBody Curso curso) {
		cursoService.salvarCurso(curso);
	}
	
}