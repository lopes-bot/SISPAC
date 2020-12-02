package br.com.migratesCreate;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;

public class Palestrante001 {
	private String sqlCreate = "CREATE TABLE palestrante(\n"
			+ "    id_palestrante serial not null,\n"
			+ "    NomeCompleto VARCHAR(100) not null,\n"
			+ "    Email VARCHAR(100) UNIQUE not null,\n"
			+ "    Telefone VARCHAR(100) default 'Sem número' UNIQUE not null,\n"
			+ "    PRIMARY KEY (id_palestrante) \n"
			+ ");";
	public  Palestrante001() {
		try {
			ConnectDb db = new ConnectDb(this.sqlCreate);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println("Migrate Palestrante001 successfully executed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
