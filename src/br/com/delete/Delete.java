package br.com.delete;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;

public class Delete {
	private int id;
	private String idTable;
	private String table;
	
	
	public Delete(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getIdTable() {
		return idTable;
	}

	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	

	public void delete() {
		String sql = "DELETE FROM "+ getTable()+" WHERE "+getIdTable()+" = ?";
		
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, getId());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
