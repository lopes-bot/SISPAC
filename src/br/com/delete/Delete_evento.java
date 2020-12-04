package br.com.delete;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Delete_evento {
	public Delete_evento(){
		
		String sql = "DELETE FROM evento where id_evento = ?";	
		Evento ev = new Evento(1);
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, ev.getId_evento());
			ps.execute();
			ps.close();

		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
}
