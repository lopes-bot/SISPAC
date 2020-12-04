package br.com.delete;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Aluno;

public class Delete_aluno {
	public Delete_aluno(int idaluno) {
		String sql = "DELETE FROM Aluno WHERE id_aluno =?";	
		Aluno alu = new Aluno(idaluno);
		
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1, alu.getId_aluno());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
}
