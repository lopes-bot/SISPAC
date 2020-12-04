package br.com.criar;
import br.com.Dbconnect.ConnectDb;
import java.sql.PreparedStatement;

import br.com.Models.Administrador;

public class Criar_admin {
	public Criar_admin() {
		
		String sql = "INSERT INTO administrador (id_admin,cpf,senha,nome,email) VALUES(?,?,?,?,?)";	
		Administrador adm = new Administrador(1,"79845054","1234","jose","vaicerto@gmail.com");
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, adm.getId_admin());
			ps.setString(2, adm.getCpf());
			ps.setString(3, adm.getSenha());
			ps.setString(4, adm.getNome());
			ps.setString(5, adm.getEmail());
			ps.execute();
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
	
}
