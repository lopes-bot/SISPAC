package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.Dbconnect.ConnectDb;

import br.com.Models.Aluno;
public class FindAluno {
	private Aluno alu;

	public Aluno getAlu() {
		return alu;
	}

	public void setAlu(Aluno alu) {
		this.alu = alu;
	}
	
	public Aluno[] findAll(int page) {
		String sql = "SELECT * FROM aluno";
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		Aluno list[] = new Aluno[10 * page];
		int cont = 0;
		try {
		
		ResultSet result =	ps.executeQuery();
		
		while(result.next()) {
			
			Aluno adm = new Aluno(
					result.getInt("id_aluno"),
					result.getString("cpf"),
					result.getString("nome"),
					result.getString("email"),
					result.getString("senha"));	
			list[cont] = adm;
			
			
			cont++;
		}
		
		ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list ;
		
	}
	public Aluno findOne(int id_aluno) {
		String sql = "SELECT * FROM aluno WHERE id_aluno= "+id_aluno;
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
		
		ResultSet result =	ps.executeQuery();
		
		
		result.next();
			Aluno alu = new Aluno(
					result.getInt("id_aluno"),
					result.getString("cpf"),
					result.getString("nome"),
					result.getString("email"),
					result.getString("senha"));	
			
			setAlu(alu);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getAlu();
	}
	

}
