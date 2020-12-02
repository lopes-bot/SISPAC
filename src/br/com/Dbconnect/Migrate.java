package br.com.Dbconnect;

import java.sql.PreparedStatement;

public class Migrate {
	
	public Migrate(String sql) {
		try {
			ConnectDb db = new ConnectDb(sql);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println(" Migrate successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
