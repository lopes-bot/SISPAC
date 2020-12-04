package br.com.delete;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Administrador;

public class Delete_admin {
	public Delete_admin() {

		String sql = "DELETE FROM administrador WHERE id_admin = ?";	
		Administrador adm = new Administrador(1);

		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, adm.getId_admin());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
