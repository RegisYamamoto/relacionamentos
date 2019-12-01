package com.regis.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamentos.model.Cpf;
import com.regis.relacionamentos.service.CpfService;

@RestController
@RequestMapping(value = "/cpfs")
public class CpfController {

	@Autowired
	private CpfService cpfService;
	
	@PostMapping(value = "/{pessoaId}")
	public void salvarrCpf(@PathVariable int pessoaId, @RequestBody Cpf cpf) {
		cpfService.salvarCpf(pessoaId, cpf);
	}
	
}