package com.Models;

public class Administrador {
	private String cnpj;
	private String senha;
	private String nome;
	private String email;
	
	public Administrador(String cnpj, String senha, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Administrador [cnpj=" + cnpj + ", senha=" + senha + ", nome=" + nome + ", email=" + email + "]";
	}
	
}
