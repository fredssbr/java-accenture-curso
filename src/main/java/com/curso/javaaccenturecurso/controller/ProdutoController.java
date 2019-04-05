package com.curso.javaaccenturecurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.javaaccenturecurso.entidade.Produto;
import com.curso.javaaccenturecurso.service.ProdutoService;

@RestController
@RequestMapping({ "/produto" })
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping // Sem #Anotacao id traz tudo !
	public Iterable<Produto> buscar() {
		Iterable<Produto> produto = produtoService.findAll();
		return produto;
	}
	
	@PostMapping
	public Produto create(@RequestBody Produto produto) {
		
		Produto salvo = produtoService.save(produto);
		
		return salvo;
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Produto delete(@PathVariable long id) {
		Produto response = produtoService.deletarProduto(id);
		return response;
	}
	
}
