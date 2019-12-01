package com.regis.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamentos.model.Pessoa;
import com.regis.relacionamentos.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping(value = "")
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.salvarPessoa(pessoa);
	}
	
	@GetMapping(value = "")
	public List<Pessoa> listarPessoa() {
		return pessoaService.listarPessoas();
	}

}