package com.curso.javaaccenturecurso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.curso.javaaccenturecurso.entidade.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	Cliente findByDocumento(String documento);

	Cliente deleteByDocumento(String documento);

}
