package br.com.criar;

import java.sql.PreparedStatement;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Criar_aluno{
	

	public Criar_aluno(int id_aluno,String cpf,String nome,String email, String senha) {
		String sql = "INSERT INTO aluno(id_aluno,cpf,nome,email,senha) VALUES(?,?,?,?,?)";	
		Aluno alu = new Aluno(id_aluno,cpf,nome,email,senha);

		
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1, alu.getId_aluno());
				ps.setString(2, alu.getCpf());
				ps.setString(3, alu.getNome());
				ps.setString(4, alu.getEmail());
				ps.setString(5, alu.getSenha());				
				ps.execute();
				ps.close();
							
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
	

}

