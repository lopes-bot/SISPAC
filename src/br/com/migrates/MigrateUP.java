package br.com.migrates;

import br.com.Dbconnect.Migrate;

public class MigrateUP {
	private String AdminCreate = "CREATE TABLE administrador(\n"
			+ "    id_admin serial,\n"
			+ "    CNPJ VARCHAR(14) UNIQUE,\n"
			+ "    Senha VARCHAR(100) NOT NULL,\n"
			+ "    Nome VARCHAR(100) NOT NULL,\n"
			+ "    Email VARCHAR(100) UNIQUE NOT NULL,\n"
			+ "    PRIMARY KEY (id_admin)\n"
			+ "    \n"
			+ ");";
	private String AlunoCreate = "\n"
			+ "CREATE TABLE aluno(\n"
			+ "    id_aluno serial,\n"
			+ "    CPF varchar(11) UNIQUE NOT NULL,\n"
			+ "    Senha VARCHAR(100) NOT NULL,\n"
			+ "    Nome VARCHAR(100) not null,\n"
			+ "    Email VARCHAR(100) UNIQUE not null,\n"
			+ "    PRIMARY KEY (id_aluno)\n"
			+ "    \n"
			+ ");";
	private String EventoCreate ="CREATE TABLE evento(\n"
			+ "    id_evento serial,\n"
			+ "    CargaHoraria VARCHAR(100) not null,\n"
			+ "    NomeEvento VARCHAR(100) not null,\n"
			+ "    endereco VARCHAR(100) default 'Local não informado' not null,\n"
			+ "    HoraInicio VARCHAR(100) not null,\n"
			+ "    HoraFim VARCHAR(100) not null,\n"
			+ "    DataInicio VARCHAR(100) not null,\n"
			+ "    DataFIM VARCHAR(100) not null,\n"
			+ "    Area VARCHAR(100) default 'Tecnologia' not null,\n"
			+ "    Vagas VARCHAR(100) default '1' not null,\n"
			+ "    PRIMARY KEY (id_evento)\n"
			+ ");";
	private String SubeventoCreate = "CREATE TABLE subevento(\r\n" + 
			"    id_subevento serial,\r\n" + 
			"	id_evento serial,\r\n" + 
			"    CargaHoraria VARCHAR not null,\r\n" + 
			"    NomeSubevento VARCHAR(100) not null,\r\n" + 
			"    endereco VARCHAR(100) default 'Local n�o informado' not null,\r\n" + 
			"    HoraInicio VARCHAR(100) not null,\r\n" + 
			"    HoraFim VARCHAR(100) not null,\r\n" + 
			"    DataSub VARCHAR(100) not null,\r\n" + 
			"    Vagas VARCHAR(100) not null,\r\n" + 
			"    PRIMARY KEY (id_subevento),\r\n" + 
			"	FOREIGN KEY (id_evento) REFERENCES evento\r\n" + 
			"	ON DELETE CASCADE\r\n" + 
			");";
	private String GerenciaPalestranteCreate = "CREATE TABLE possuiPalestrante(\r\n" + 
			"	id_subevento serial,\r\n" + 
			"    id_palestrante serial,\r\n" + 
			"	FOREIGN KEY (id_subevento) REFERENCES subevento ON DELETE CASCADE,\r\n" + 
			"	FOREIGN KEY (id_palestrante) REFERENCES palestrante\r\n" + 
			"		ON DELETE CASCADE\r\n" + 
			");";
	private String PalestranteCreate = "CREATE TABLE palestrante(\n"
			+ "    id_palestrante serial not null,\n"
			+ "    NomeCompleto VARCHAR(100) not null,\n"
			+ "    Email VARCHAR(100) UNIQUE not null,\n"
			+ "    Telefone VARCHAR(100) default 'Sem número' UNIQUE not null,\n"
			+ "    PRIMARY KEY (id_palestrante) \n"
			+ ");";
    Migrate admin = new Migrate(this.AdminCreate);	
    Migrate aluno = new Migrate(this.AlunoCreate);
    Migrate evento = new Migrate(this.EventoCreate);
    Migrate sub = new Migrate(this.SubeventoCreate);
    Migrate Pale = new Migrate(this.PalestranteCreate);
    Migrate gen = new Migrate(this.GerenciaPalestranteCreate);
}
