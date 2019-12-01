package com.regis.relacionamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.relacionamentos.model.Telefone;
import com.regis.relacionamentos.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public void salvarTelefone(Telefone telefone, long pessoaId) {
		String telefoneString = telefone.getTelefone();
		telefoneRepository.salvarTelefone(telefoneString, pessoaId);
	}
	
}