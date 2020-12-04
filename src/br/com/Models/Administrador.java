package br.com.Models;

public class Administrador {
	private int id_admin;
	private String cpf;
	private String senha;
	private String nome;
	private String email;
	
	public Administrador(int id_admin, String cpf, String senha, String nome, String email) {
		this.id_admin = id_admin;
		this.cpf = cpf;
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
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		return "Administrador [id_admin=" + id_admin + ", cpf=" + cpf + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + "]";
	}
	
}
