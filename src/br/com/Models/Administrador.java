package br.com.Models;

public class Administrador {
	private int id_admin;
	private String cnpj;
	private String senha;
	private String nome;
	private String email;
	
	public Administrador(int id_admin, String cnpj, String senha, String nome, String email) {
		this.id_admin = id_admin;
		this.cnpj = cnpj;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	
	public Administrador(int id_admin, String senha, String nome, String email) {
		this.id_admin = id_admin;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}

	public Administrador(int id_admin) {
		this.id_admin = id_admin;
	}
	
	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cpf) {
		this.cnpj = cpf;
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
		return "Administrador [id_admin=" + id_admin + ", cnpj=" + cnpj + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + "]";
	}
	
}
