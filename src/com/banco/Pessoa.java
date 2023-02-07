package com.banco;

public class Pessoa {

	// Atributos
	public int idPessoa;
	public String nome;
	public String telefone; 
	public String profissao;
	
 
	// Construtor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		this.idPessoa = idPessoa;
	}


	public int getIdPessoa() {
		return idPessoa;
	}


	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
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


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
