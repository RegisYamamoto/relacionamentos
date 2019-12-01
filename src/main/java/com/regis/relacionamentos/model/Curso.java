package com.regis.relacionamentos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String curso;

	// cursomc
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "pessoa_curso",
		joinColumns = @JoinColumn(name = "curso_id"),
		inverseJoinColumns = @JoinColumn(name = "pessoa_id")
	)
	private List<Pessoa> pessoa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", curso=" + curso + ", pessoa=" + pessoa + "]";
	}

}