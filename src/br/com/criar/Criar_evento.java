package br.com.criar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;
import java.util.Date;
public class Criar_evento {

	//Date datai = new Date("10/10/2033");
	//Date dataf = new Date("15/10/2033");
	Date horai = new Date("10:00");
	Date horaf = new Date("11:00");
	public Criar_evento() {
			
			String sql = "INSERT INTO evento (CargaHoraria,NomeEvento,endereco,HoraInicio,HoraFim,DataInicio,DataFIM,Area,Vagas) VALUES (?,?,?,?,?,?,?,?,?)";	
			Evento ev = new Evento("churrasco", "ufersa",null , null ,null ,null , "culinaria", "10", "50");
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps =con.getPs();
			try {
				ps.setString(1, ev.getCargaHoraria());
				ps.setString(2, ev.getNomeEvento());
				ps.setString(3, ev.getEndereco());
				ps.setDate(4, (java.sql.Date) ev.getHoraInicio());
				ps.setDate(5, (java.sql.Date) ev.getHoraFim());
				ps.setString(6, "10/10/2011");
				ps.setString(7, "20/10/2011");
				ps.setString(8, ev.getArea());
				ps.setString(9, ev.getVagas());
				ps.execute();
				System.out.println(sql);
				ps.close();
				
			}catch(Exception e) {
				System.out.println(e);
			}
		
		}


}

