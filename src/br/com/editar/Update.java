package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;

public class Update {
	private int id;
	
	

	public Update(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void update(String valor, String sql) {
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, valor);	
			ps.setInt(2,getId());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
