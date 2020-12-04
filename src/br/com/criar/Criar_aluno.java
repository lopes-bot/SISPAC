package br.com.criar;

import java.sql.PreparedStatement;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Criar_aluno{
	
	public Criar_aluno(String cpf,String nome,String email, String senha) {
		String sql = "INSERT INTO aluno(cpf,nome,email,senha) VALUES(?,?,?,?)";	
		Aluno alu = new Aluno(cpf,nome,email,senha);
		
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setString(1, alu.getCpf());
				ps.setString(2, alu.getSenha());
				ps.setString(3, alu.getNome());
				ps.setString(4, alu.getEmail());
				ps.execute();
				System.out.println(sql);
				System.out.println(alu);
				ps.close();
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
	

}

