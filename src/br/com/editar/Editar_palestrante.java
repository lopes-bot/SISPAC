package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Palestrante;

public class Editar_palestrante {
	
	public Editar_palestrante() {
		String sql = "UPDATE  palestrante SET nomecompleto = ?, email = ?, telefone = ? WHERE id_palestrante =?";	
		Palestrante pale = new Palestrante(1,"joose victor magalhaes","vaicerto@gmail.com", "(88) 99921214");
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setString(1, pale.getNomecompleto());
				ps.setString(2, pale.getEmail());
				ps.setString(3, pale.getTelefone());
				ps.setInt(4,pale.getId_palestrante());
				ps.execute();
				ps.close();
			}catch(Exception e) {
			System.out.println(e);
		}
	}
}
