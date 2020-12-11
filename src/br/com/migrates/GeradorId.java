package br.com.migrates;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.Dbconnect.ConnectDb;

public class GeradorId {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int id_admin() {
		String sql = "SELECT MAX(id_admin) AS id_admin FROM administrador;";
		return connecction(sql,"id_admin");
	}
	public int id_aluno() {
		String sql = "SELECT MAX(id_aluno) AS id_aluno FROM aluno;";
		return connecction(sql,"id_aluno");
	}
	public int id_evento() {
		String sql = "SELECT MAX(id_evento) AS id_evento FROM evento;";
		return connecction(sql,"id_evento");
	}
	public int id_subevento() {
		String sql = "SELECT MAX(id_subevento) AS id_subevento FROM subevento;";
		return connecction(sql,"id_subevento");
	}
	public int id_palestrante() {
		String sql = "SELECT MAX(id_palestrante) AS id_palestrante FROM palestrante;";
		return connecction(sql,"id_palestrante");
	}
	public int connecction(String sql, String idname) {
		
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		try {
			ResultSet result =	ps.executeQuery();
						
			result.next();
			setId(result.getInt(idname));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return getId() + 1;
	}

}
