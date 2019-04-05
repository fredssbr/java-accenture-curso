package com.curso.javaaccenturecurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.javaaccenturecurso.entidade.Produto;
import com.curso.javaaccenturecurso.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Iterable<Produto> findAll() {
		Iterable<Produto> listProduto = repository.findAll();
		return listProduto;
	}

	public Produto save(Produto produto) {
		return repository.save(produto);
		
		
	}
	
	public Produto deletarProduto(long id) {
		Produto response = repository.findByIdProduto(id);
		repository.delete(response);
		return response;
	}
}
