package com.sispacdb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Models.Administrador;

public class ConnectDb {
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sispac","postgres","1234");
						
			if(connection != null) {
				System.out.println("connection ok");
			}else {
				System.out.println("connection failed");
			}
			
			String sql = "INSERT INTO administrador (cnpj,senha,nome,email) VALUES(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			Administrador adm = new Administrador("789456123","1234","André","andre@gmail.com");
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
