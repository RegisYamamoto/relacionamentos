package com.regis.relacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamentos.model.Telefone;
import com.regis.relacionamentos.service.TelefoneService;

@RestController
@RequestMapping(value = "/telefones")
public class TelefoneController {

	@Autowired
	private TelefoneService telefoneService;
	
	@PostMapping(value = "/{pessoaId}")
	public void salvarTelefone(@PathVariable long pessoaId, @RequestBody Telefone telefone) {
		telefoneService.salvarTelefone(telefone, pessoaId);
	}
	
}