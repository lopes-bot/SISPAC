package br.com.buscas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.Models.Administrador;
import br.com.Dbconnect.ConnectDb;

public class FindAdmin {
		
		
		private Administrador adm;

		public Administrador getAdm() {
			return adm;
		}

		public void setAdm(Administrador adm) {
			this.adm = adm;
		}

		public Administrador[] findAll(int page) {
			String sql = "SELECT * FROM administrador";
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps = con.getPs();
			Administrador list[] = new Administrador[10 * page];
			int cont = 0;
			try {
			
			ResultSet result =	ps.executeQuery();
			
			while(result.next()) {
				
				Administrador adm = new Administrador(
						result.getInt("id_admin"),
						result.getString("cnpj"),
						result.getString("senha"),
						result.getString("nome"),
						result.getString("email"));	
				list[cont] = adm;
				
				
				cont++;
			}
			
			ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return list ;
		}
		
		public Administrador findOne(int id_admin) {
			String sql = "SELECT * FROM administrador WHERE id_admin ="+ id_admin;
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps = con.getPs();
			
			try {
			
			ResultSet result =	ps.executeQuery();
			
			
			result.next();
				Administrador adm = new Administrador(
						result.getInt("id_admin"),
						result.getString("cnpj"),
						result.getString("senha"),
						result.getString("nome"),
						result.getString("email"));	
				
				setAdm(adm);
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			return getAdm();
		}
		
		public Administrador Login(String email, String senha) {
			
			String sql = "SELECT * FROM administrador WHERE senha= '"+senha+"' AND email= '"+email+"';";
			String sql2 = "SELECT * FROM administrador WHERE senha= 'senha' AND email= 'email@gmail.com';";
			ConnectDb con = new ConnectDb(sql2);
			System.out.println(sql);
			System.out.println(sql2);
			PreparedStatement ps = con.getPs();
			
			try {
			
			ResultSet result =	ps.executeQuery();
			
			
			result.next();
			
				Administrador adm = new Administrador(
						result.getInt("id_admin"),
						result.getString("cnpj"),
						result.getString("senha"),
						result.getString("nome"),
						result.getString("email"));	
				
				setAdm(adm);
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			return getAdm();
		}
}
