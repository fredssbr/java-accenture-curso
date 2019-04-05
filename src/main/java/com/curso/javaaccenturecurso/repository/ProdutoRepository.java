package com.curso.javaaccenturecurso.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.javaaccenturecurso.entidade.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

	Produto findByIdProduto(long id);
		
}
