package br.com.Dbconnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ConnectDb {
	private Connection connection = null;
	private PreparedStatement ps;
		public ConnectDb(String sql) {
			try {
				Class.forName("org.postgresql.Driver");
				this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sispac","postgres","1234");
							
				if(this.connection != null) {
					System.out.println("connection ok");
				}else {
					System.out.println("connection failed");
				}
				
				
				this.ps = this.connection.prepareStatement(sql);
				

			}catch(Exception e) {
				System.out.println(e);
				
			}
		}
		public PreparedStatement getPs() {
			return this.ps;
		}
		
		
		
}
	
	
	
	
		
		
		
		
	


