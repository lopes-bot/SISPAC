package br.com.Models;

public class Aluno {
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	
	public Aluno(String cpf, String nome, String email, String senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
