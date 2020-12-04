package br.com.delete;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Palestrante;

public class Delete_palestrante {
	public Delete_palestrante() {
		String sql = "DELETE FROM palestrante WHERE id_palestrante =?";	
		Palestrante pale = new Palestrante(1);
		ConnectDb con = new ConnectDb(sql);
		
		PreparedStatement ps = con.getPs();
		
		try {
				ps.setInt(1,pale.getId_palestrante());
				ps.execute();
				ps.close();
			}catch(Exception e) {
			System.out.println(e);
		}
	}
}
