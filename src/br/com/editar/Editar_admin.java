package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Administrador;

public class Editar_admin {
	private int id_admin;
	public Editar_admin(int id_admin) {
		this.id_admin = id_admin;
		
	}
	
	public void EditarAdminEmail(String email) {
		String sql = "UPDATE administrador set email = ? WHERE id_admin = ?";		
		update(email,sql);
	}
	
	public void EditarAdminSenha(String senha) {
		String sql = "UPDATE administrador set senha = ? WHERE id_admin = ?";
		update(senha,sql);
	}
	public void EditarAdminNome(String nome) {
		String sql = "UPDATE administrador set  nome = ? WHERE id_admin = ?";
		update(nome,sql);
	}
	
	public int getId_admin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	
	public void update(String valor, String sql) {
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, valor);	
			ps.setInt(2,getId_admin());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
