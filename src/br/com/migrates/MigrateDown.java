package br.com.migrates;

import br.com.Dbconnect.Migrate;

public class MigrateDown {
	private String AdminDrop = "DROP TABLE administrador";
	private String AlunoDrop = "DROP TABLE aluno";
	private String EventoDrop = "DROP TABLE evento";
	private String SubeventoDrop = "DROP TABLE subevento";
	private String PalestrantDrop ="DROP TABLE palestrante";
	Migrate adm = new Migrate(this.AdminDrop);
	Migrate alu = new Migrate(this.AlunoDrop);
	Migrate sub = new Migrate(this.SubeventoDrop);
	Migrate pale = new Migrate(this.PalestrantDrop);
	Migrate eve = new Migrate(this.EventoDrop);
}
