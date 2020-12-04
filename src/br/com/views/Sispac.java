package br.com.views;

import br.com.migrates.*;

import br.com.criar.*;

public class Sispac {
	public static void main(String[] ags) {
		//MigrateUP migrates = new MigrateUP();// cria as tabelas no banco 
		//MigrateDown migrates = new MigrateDown();// remove as tabelas do banco

		//Criar_admin ad = new Criar_admin(1,"789456123","teste","escola fundamental","ef@gmail.com");
		//Criar_aluno al = new Criar_aluno(2,"005447646","joao","Ljo32sos@gmail","a23re");
		/*Criar_evento ev = new Criar_evento(2,"Ecop",
				"Ufersa campus pdf","10/05/2021",
				"15/10/2021","10:00","17:00","tecnologia","110","200");
		*/
		/*Criar_subevento sub = new Criar_subevento(1,1,"10","palestra sobre computadores modernos"
				,"Ufersa campus pdf","10:25","11:25","10/05/2021","15");*/
	
		//Criar_palestrante pale = new Criar_palestrante(1,"Jose da silva","silva@gmail.com","(88)99587-4567");
		//gerencia palestrante tem que ser criado  depois de subevento e palestrante
		Criar_gerenciaPalestrante gp = new Criar_gerenciaPalestrante(1,1);
	}

}
