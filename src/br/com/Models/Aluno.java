package br.com.Models;

public class Aluno {
	private int id_aluno;
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	

	public Aluno(int id_aluno, String cpf, String nome, String email, String senha) {
		
		this.id_aluno = id_aluno;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public Aluno(int id_aluno, String senha) {
		this.id_aluno = id_aluno;
		this.senha = senha;
	}
	
	public Aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	
	public int getId_aluno() {
		return id_aluno;
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
	
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	@Override
	public String toString() {
		return "Aluno [id_aluno=" + id_aluno + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", senha="
				+ senha + "]";
	}
	
	
	
	
<<<<<<< HEAD


=======
>>>>>>> teste
}
