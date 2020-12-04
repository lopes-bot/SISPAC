package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Administrador;

public class Editar_admin {
	public Editar_admin() {

		String sql = "UPDATE administrador set senha = ?,email = ?, nome = ? WHERE id_admin = ?";	
		Administrador adm = new Administrador(1,"123456","jose victor","vaicerto45@gmail.com");

		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, adm.getSenha());
			ps.setString(2, adm.getEmail());
			ps.setString(3, adm.getNome());
			ps.setInt(4, adm.getId_admin());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
