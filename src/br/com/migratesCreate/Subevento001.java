package br.com.migratesCreate;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;

public class Subevento001 {
	private String sqlCreate = "CREATE TABLE subevento(\n"
			+ "    id_subevento serial,\n"
			+ "    id_evento serial,\n"
			+ "    CargaHoraria INTEGER default '1' not null,\n"
			+ "    NomeSubevento VARCHAR(100) not null,\n"
			+ "    endereco VARCHAR(100) default 'Local não informado' not null,\n"
			+ "    HoraInicio TIME not null,\n"
			+ "    HoraFim TIME not null,\n"
			+ "    DataSub DATE not null,\n"
			+ "    Vagas VARCHAR(30) default '1' not null,\n"
			+ "    PRIMARY KEY (id_subevento),\n"
			+ "    FOREIGN KEY (id_evento) REFERENCES evento\n"
			+ ");";
	public Subevento001() {
		try {
			ConnectDb db = new ConnectDb(this.sqlCreate);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println("Migrate Subevento001 successfully executed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
