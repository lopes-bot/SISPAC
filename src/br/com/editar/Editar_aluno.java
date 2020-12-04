package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Editar_aluno {
	public Editar_aluno() {
			
			String sql = "UPDATE aluno set senha = ? WHERE id_aluno = ?";	
			Aluno al = new Aluno(1,"92787414");
			
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps =con.getPs();
			try {
				ps.setString(1, al.getSenha());
				ps.setInt(2, al.getId_aluno());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}
}
