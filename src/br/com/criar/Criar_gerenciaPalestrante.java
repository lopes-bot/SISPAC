package br.com.criar;

import java.sql.PreparedStatement;


import br.com.Dbconnect.ConnectDb;
import br.com.Models.Gerenciapalestrante;

public class Criar_gerenciaPalestrante {
	
	public Criar_gerenciaPalestrante() {
		String sql = " possuiPalestrante(id_subevento, id_palestrante) VALUES(?,?)";	
		Gerenciapalestrante pale = new Gerenciapalestrante(1,1);
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1, pale.getId_subevento());
				ps.setInt(2, pale.getId_palestrante());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
	
}