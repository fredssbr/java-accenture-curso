package com.curso.javaaccenturecurso.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUTO")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PEDIDO_NUMEROSEQUENCIALPEDIDO_GENERATOR")
	@SequenceGenerator(sequenceName = "SQ_PEDIDO", allocationSize = 1, name = "PEDIDO_NUMEROSEQUENCIALPEDIDO_GENERATOR")
	@Column(name = "NUMERO", nullable = false, precision = 15)
	private long numeroPedido;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", nullable = false)
	public Date dataPedido;

	@Column(name = "STATUS", nullable = true, precision = 15)
	private String status;
	
	@Column(name = "VALOR_TOTAL", nullable = true, precision = 15)
	private BigDecimal valorTotal;
	
	@Column(name = "QUANTIDADE", nullable = true, precision = 15)
	private Integer quantidade;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DOCUMENTO")
	public Cliente cliente;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_PRODUTO")
	public Produto produto;

	public long getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
}
