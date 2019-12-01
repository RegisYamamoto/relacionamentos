package com.regis.relacionamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regis.relacionamentos.model.Cpf;
import com.regis.relacionamentos.repository.CpfRepository;

@Service
public class CpfService {

	@Autowired
	private CpfRepository cpfRepository;
	
	public void salvarCpf(long pessoaId, Cpf cpf) {
		String cpfString = cpf.getCpf();
		cpfRepository.salvarCpf(pessoaId, cpfString);
	}

}