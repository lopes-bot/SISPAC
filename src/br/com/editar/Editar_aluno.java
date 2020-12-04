package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Editar_aluno {
	private int id_aluno;
	
	public Editar_aluno(int id_aluno) {
			this.id_aluno = id_aluno;
			
				
	}
	public void EditarAlunoSenha(String senha) {
		String sql = "UPDATE aluno set senha = ? WHERE id_aluno = ?";	
		update(senha,sql);
	}
	public void EditarAlunoEmail(String email) {
		String sql = "UPDATE aluno set email = ? WHERE id_aluno = ?";		
		update(email,sql);
	}
	
	
	public void EditarAlunoNome(String nome) {
		String sql = "UPDATE aluno set  nome = ? WHERE id_aluno = ?";
		update(nome,sql);
	}
	
	public void update(String valor, String sql) {
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, valor);	
			ps.setInt(2,getId_aluno());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	
}
