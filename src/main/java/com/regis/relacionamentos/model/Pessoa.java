package com.regis.relacionamentos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	// cursomc
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
	private Cpf cpf;

	// cursomc
//	@OneToMany(mappedBy = "pessoa")
//	private List<Telefone> telefone;
	
	// busca-produtos-vtex-1
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "pessoa_id")
//	private List<Telefone> telefone;
	
	// busca-produtos-vtex-2
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private List<Telefone> telefone;
	
	// cursomc
	@ManyToMany(mappedBy="pessoa")
	private List<Curso> curso;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

}