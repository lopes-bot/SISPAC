package br.com.views;

import br.com.migrates.*;
import br.com.editar.*;
import br.com.Models.Administrador;
import br.com.Models.Aluno;
import br.com.Models.Evento;
import br.com.buscas.FindAdmin;
import br.com.buscas.FindAluno;
import br.com.buscas.FindEvento;
import br.com.criar.*;
import br.com.delete.*;


public class Sispac {
	public static void main(String[] ags) {
		//MigrateUP migrates = new MigrateUP();// cria as tabelas no banco 
		//MigrateDown migrates = new MigrateDown();// remove as tabelas do banco


		//Criar_admin ad = new Criar_admin(3,"79848483","senha","teste","teste@gmail.com");
		//Criar_aluno al = new Criar_aluno(2,"07547646","joao teste","teste@gmail","senha");
		/*Criar_evento ev = new Criar_evento(3,"Ecop3",
				"Ufersa campus pdf","10/05/2021",
				"15/10/2021","10:00","17:00","tecnologia","110","200");
		*/
		/*Criar_subevento sub = new Criar_subevento(1,1,"10","palestra sobre computadores modernos"
				,"Ufersa campus pdf","10:25","11:25","10/05/2021","15");*/
	
		//Criar_palestrante pale = new Criar_palestrante(1,"Jose da silva","silva@gmail.com","(88)99587-4567");
		//gerencia palestrante tem que ser criado  depois de subevento e palestrante
		//Criar_gerenciaPalestrante gp = new Criar_gerenciaPalestrante(1,1);

		//Editar_admin ed1 = new Editar_admin(1);//necessario passar o id_admin
		//ed1.EditarEmail("segundo@gmail");
		//ed1.EditarSenha("4234");
		//ed1.EditarNome("segundão");
		
		//Editar_aluno ed2 = new Editar_aluno(1);//necessario passar o id_aluno
		//ed2.EditarSenha("testando senha");
		//ed2.EditarEmail("aluno@gmail");
		//ed2.EditarNome("Ganbiarra");
		
		//Editar_palestrante p = new Editar_palestrante(1);//necessario passar o id_palestrante
		//p.EditarSenha("dsadhiah");
		//p.EditarEmail("novo@gmail");
		//p.EditarNome("André Lopes");
		//p.EditarTelefone("3422-8446");
		
		
		//Editar_evento ev = new Editar_evento(1);//necessario passar p id_evento
		//ev.EditarCargaHoraria("200");
		//ev.EditarNome("olimpiada de fisica");
		//ev.EditarEndereco("Iracema - ce");
		//ev.EditarHoraInicio("09:00");
		//ev.EditarHoraTermino("13:00");
		//ev.EditarDataInicio("20/08/2020");
		//ev.EditarDataTermino("05/09/2020");
		//ev.EditarArea("Biologicas");
		//ev.EditarVagas("110");
		
		//Editar_subevento s = new Editar_subevento(1);//necessario passar p id_subevento
		//s.EditarCargaHoraria("10");
		//s.EditarEndereco("sala 10 bloco A");
		//s.EditarHoraInicio("13:00");
		//s.EditarHoraTermino("17:00");
		//s.EditarNome("super poderes");
		//s.EditarVagas("3");
		//s.EditarData("10/01/2021");
		
		//Delete_admin d1 = new Delete_admin(1);
		//Delete_aluno d2 = new Delete_aluno(1);
		//Delete_evento d3 = new Delete_evento(1);
		//Delete_palestrante d5 = new Delete_palestrante(1);
		
		//FindAdmin adm = new FindAdmin();
		//adm.Login("andre@gmail.com", "senha"); // fazer login necessita de email e senha
		//adm.findOne(1);//necessario o id do admin;
		//	System.out.println(adm.findOne(1));
		//Administrador list[] = adm.findAll(1); // necessario informa a pagina obs paginas maior que 0
		/*for(int i =0 ; i<10 ; i++) {
			if(list[i] !=null) {
				System.out.println(list[i]);
			}
			
		}*/
		
		
		
		//FindAluno alu = new FindAluno();
		//alu.Login("teste@gmail", "senha");
		//System.out.println(alu.Login("teste@gmail", "senha"));
		///System.out.println(alu.findOne(1));// necessario informa o id_aluno
		/*Aluno list2[] = alu.findAll(1);// necessario informa a pagina obs paginas maior que 0
		for(int i =0 ; i<10 ; i++) {
			if(list2[i] !=null) {
				System.out.println(list2[i]);
			}
			
		}*/
		
		/*
		 FindEvento ev = new FindEvento();
		 System.out.println(ev.findOne(1));// necessario informa o id_aluno
		 Evento list3[] =  ev.findAll(1);// necessario informa a pagina obs paginas maior que 0
				for(int i =0 ; i<10 ; i++) {
					if(list3[i] !=null) {
						System.out.println(list3[i]);
					}
					
		}
		*/
	}

}
