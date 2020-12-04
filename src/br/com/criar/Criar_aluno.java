package br.com.criar;

import java.sql.PreparedStatement;
import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Criar_aluno {
	
	public Criar_aluno() {
		String sql = "INSERT INTO aluno(cpf,senha,nome,email) VALUES(?,?,?,?)";	
		Aluno alu = new Aluno("79848797","1234","jose","vaicerto@gmail.com");
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setString(1, alu.getCpf());
				ps.setString(2, alu.getSenha());
				ps.setString(3, alu.getNome());
				ps.setString(4, alu.getEmail());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
	

}

