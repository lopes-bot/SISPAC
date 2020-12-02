package br.com.views;

import br.com.migrates.*;


public class Sispac {
	public static void main(String[] ags) {
		//MigrateUP migrates = new MigrateUP();// cria as tabelas no banco 
		MigrateDown migrates = new MigrateDown();// remove as tabelas do banco
	}

}
