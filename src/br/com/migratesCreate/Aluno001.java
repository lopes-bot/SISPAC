package br.com.migratesCreate;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;

public class Aluno001 {
	private String sqlCreate = "\n"
			+ "CREATE TABLE aluno(\n"
			+ "    id_aluno serial,\n"
			+ "    CPF varchar(11) UNIQUE NOT NULL,\n"
			+ "    Senha VARCHAR(100) NOT NULL,\n"
			+ "    Nome VARCHAR(100) not null,\n"
			+ "    Email VARCHAR(100) UNIQUE not null,\n"
			+ "    PRIMARY KEY (id_aluno)\n"
			+ "    \n"
			+ ");";
	public Aluno001() {
		try {
			ConnectDb db = new ConnectDb(this.sqlCreate);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println("Migrate Aluno001 successfully executed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
