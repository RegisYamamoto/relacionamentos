package com.regis.relacionamentos.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.regis.relacionamentos.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Modifying
	@Transactional
	@Query(value = "insert into curso (curso) values (?1)", nativeQuery = true)
	void salvarCurso(String curso);
	
}