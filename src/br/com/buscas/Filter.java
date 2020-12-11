package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Filter {
	private Evento ev;

	public Evento getEv() {
		return ev;
	}

	public void setEv(Evento ev) {
		this.ev = ev;
	}
	
	public Evento findNome(String nome) {
		String sql = "SELECT * FROM evento WHERE nomeevento= '"+nome+"'";
		
		return connection(sql);
		
	}
	
	
	public Evento findEdereco(String endereco) {
		String sql = "SELECT * FROM evento WHERE endereco= '"+endereco+"'";
		
		return connection(sql);
		
	}
	public Evento findArea(String area) {
		String sql = "SELECT * FROM evento WHERE area= '"+area+"'";
		
		return connection(sql);
		
	}
	
	public Evento findData(String data) {
		String sql = "SELECT * FROM evento WHERE datainicio= '"+data+"'";
		
		return connection(sql);
		
	}
	public Evento connection (String sql) {
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
		
		ResultSet result =	ps.executeQuery();
		
		
		result.next();
			
		Evento even = new Evento(
				result.getInt("id_evento"),
				result.getString("nomeevento"),
				result.getString("endereco"),
				result.getString("datainicio"),
				result.getString("datafim"),
				result.getString("horainicio"),
				result.getString("horafim"),
				result.getString("area"),
				result.getString("vagas"),
				result.getString("cargahoraria")					
				);
			setEv(even);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getEv();
	}

}
