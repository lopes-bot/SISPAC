package br.com.migratesCreate;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
public class Admin001 {
	private String sqlCreate = "CREATE TABLE administrador(\n"
			+ "    id_admin serial,\n"
			+ "    CNPJ VARCHAR(14) UNIQUE,\n"
			+ "    Senha VARCHAR(100) NOT NULL,\n"
			+ "    Nome VARCHAR(100) NOT NULL,\n"
			+ "    Email VARCHAR(100) UNIQUE NOT NULL,\n"
			+ "    PRIMARY KEY (id_admin)\n"
			+ "    \n"
			+ ");";
	public Admin001() {
		try {
			ConnectDb db = new ConnectDb(this.sqlCreate);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println("Migrate Admin001 successfully executed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
