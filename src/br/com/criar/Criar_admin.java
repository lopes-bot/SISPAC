package br.com.criar;
import br.com.Dbconnect.ConnectDb;
import java.sql.PreparedStatement;

import br.com.Models.Administrador;

public class Criar_admin {
	public Criar_admin() {
		
		String sql = "INSERT INTO administrador (cnpj,senha,nome,email) VALUES(?,?,?,?)";	
		Administrador adm = new Administrador("79845054","1234","jose","vaicerto@gmail.com");
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, adm.getCnpj());
			ps.setString(2, adm.getSenha());
			ps.setString(3, adm.getNome());
			ps.setString(4, adm.getEmail());
			ps.execute();
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
	
}
