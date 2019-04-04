package com.curso.javaaccenturecurso.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE", schema= "")
public class Cliente implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DOCUMENTO", nullable = false, precision = 15)
	private String documento;
	
	@Column(name = "NOME", nullable = false, precision = 256)
	private String nome;
	
	@Column(name = "TELEFONE", nullable = false, precision = 15)
	private String telefone;
	
	@Column(name = "EMAIL", nullable = false, precision = 256)
	private String email;
	
	@Column(name = "ENDERECO", nullable = false, precision = 256)
	private String endereco;
	
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email
				+ ", endereco=" + endereco + "]";
	}
	
	

}
