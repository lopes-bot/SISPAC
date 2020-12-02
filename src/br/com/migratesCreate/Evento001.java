package br.com.migratesCreate;
import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
public class Evento001 {
	private String sqlCreate = "CREATE TABLE evento(\n"
			+ "    id_evento serial,\n"
			+ "    CargaHoraria INTEGER default 1 not null,\n"
			+ "    NomeEvento VARCHAR(100) not null,\n"
			+ "    endereco VARCHAR(100) default 'Local não informado' not null,\n"
			+ "    HoraInicio TIME not null,\n"
			+ "    HoraFim TIME not null,\n"
			+ "    DataInicio DATE not null,\n"
			+ "    DataFIM DATE not null,\n"
			+ "    Area VARCHAR(100) default 'Tecnologia' not null,\n"
			+ "    Vagas VARCHAR(100) default '1' not null,\n"
			+ "    PRIMARY KEY (id_evento)\n"
			+ ");";
	public Evento001() {
		try {
			ConnectDb db = new ConnectDb(this.sqlCreate);
			PreparedStatement ps = db.getPs();
			ps.execute();
			System.out.println("Migrate Evento001 successfully executed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	

}
