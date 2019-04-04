package com.curso.javaaccenturecurso.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUTO_NUMEROSEQUENCIALPRODUTO_GENERATOR")
	@SequenceGenerator(sequenceName = "SQ_PRODUTO", allocationSize = 1, name = "PRODUTO_NUMEROSEQUENCIALPRODUTO_GENERATOR")
	@Column(name = "ID_PRODUTO", nullable = false, precision = 15)
	private long idProduto;
	
	@Column(name = "DESCRICAO", nullable = false, precision = 256)
	private String descricao;
	
	@Column(name = "VALOR", nullable = true, precision = 15)
	private long valor;

	

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	

}
