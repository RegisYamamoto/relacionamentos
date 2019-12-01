package com.regis.relacionamentos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String telefone;

	// cursomc
//	@ManyToOne
//	@JoinColumn(name = "pessoa_id")
//	@JsonIgnore
//	private Pessoa pessoa;
	
	// busca-produtos-vtex-1
//	@ManyToOne
//	@JoinColumn(name = "pessoa_id")
//	@JsonIgnore
//	private Pessoa pessoa;
	
	// busca-produtos-vtex-1
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	@JsonIgnore
	private Pessoa pessoa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", telefone=" + telefone + ", pessoa=" + pessoa + "]";
	}

}