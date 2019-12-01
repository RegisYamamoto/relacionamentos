package com.regis.relacionamentos.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.regis.relacionamentos.model.Cpf;

@Repository
public interface CpfRepository extends JpaRepository<Cpf, Long> {

	@Modifying
	@Transactional
	@Query(value = "insert into cpf (cpf, pessoa_id) values (?2, ?1)", nativeQuery = true)
	void salvarCpf(long pessoaId, String cpf);
	
}