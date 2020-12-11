package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;
import br.com.Models.Subevento;

public class FindSubevento {
	private Subevento sub;

	public Subevento getSub() {
		return sub;
	}

	public void setSub(Subevento sub) {
		this.sub = sub;
	}
	public Subevento[] findAll(int page, int id_evento ) {
		String sql = "SELECT * FROM subevento WHERE id_evento= "+id_evento;
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		Subevento list[] = new Subevento[10 * page];
		int cont = 0;
		try {
		
		ResultSet result =	ps.executeQuery();
		
		while(result.next()) {
			
			Subevento sub = new Subevento(
					result.getInt("id_evento"),
					result.getInt("id_subevento"),
					result.getString("cargahoraria"),
					result.getString("nomesubevento"),
					result.getString("endereco"),
					result.getString("horainicio"),
					result.getString("horafim"),
					result.getString("datasub"),
					result.getString("vagas")					
					);
			
			list[cont] = sub;
			
			
			cont++;
		}
		
		ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list ;
		
	}
	public Subevento findOne(int id_evento , int id_subevento) {
		String sql = "SELECT * FROM subevento WHERE id_evento= "+id_evento+"AND id_subevento="+id_subevento+"";
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps = con.getPs();
		
		try {
			ResultSet result =	ps.executeQuery();
			result.next();
			Subevento sub = new Subevento(
					result.getInt("id_evento"),
					result.getInt("id_subevento"),
					result.getString("cargahoraria"),
					result.getString("nomesubevento"),
					result.getString("endereco"),
					result.getString("horainicio"),
					result.getString("horafim"),
					result.getString("datasub"),
					result.getString("vagas")					
					);
		
			setSub(sub);
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return getSub();
	}
}
