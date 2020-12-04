package br.com.criar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Palestrante;

public class Criar_palestrante {
	
	public Criar_palestrante(int id_palestrante, String nomecompleto, String email, String telefone) {
		String sql = "INSERT INTO palestrante(id_palestrante,nomecompleto,email,telefone) VALUES(?,?,?,?)";	
		Palestrante pale = new Palestrante(id_palestrante,nomecompleto,email, telefone);
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1,pale.getId_palestrante());
				ps.setString(2, pale.getNomecompleto());
				ps.setString(3, pale.getEmail());
				ps.setString(4, pale.getTelefone());
				ps.execute();
				ps.close();
				System.out.println(sql);
				System.out.println(pale);
			}catch(Exception e) {
				
			System.out.println(e);
		}
	}
	
}
