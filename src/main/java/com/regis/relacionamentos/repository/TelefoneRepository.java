package com.regis.relacionamentos.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.regis.relacionamentos.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

	@Modifying
	@Transactional
	@Query(value = "insert into telefone (telefone, pessoa_id) values (?1, ?2)", nativeQuery = true)
	void salvarTelefone(String telefone, long pessoa_id);
	
}