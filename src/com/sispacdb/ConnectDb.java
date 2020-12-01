package com.sispacdb;
import java.sql.Connection;
import java.sql.DriverManager;
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
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
