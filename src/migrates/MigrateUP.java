package migrates;

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
	private String SubeventoCreate = "CREATE TABLE subevento(\n"
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
				
}
