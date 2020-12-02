package br.com.criar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Criar_evento {
	public Criar_evento() {
			
			String sql = "INSERT INTO evento (CargaHoraria,NomeEvento,endereco,HoraInicio,HoraFim,DataInicio,DataFIM,Area,Vagas) VALUES (?,?,?,?,?,?,?,?,?)";	
			Evento ev = new Evento("200", "Inteligencia artificial", "avenida augusta", "08:00", "10:00", "20/04/2021", "23/04/2021", "tecnologia", "1000" );
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps =con.getPs();
			try {
				ps.setString(1, ev.getArea());
				ps.setString(2, ev.getDataAbertura());
				ps.setString(3, ev.getDataEncerra());
				ps.setString(4, ev.getEndereco());
				ps.setString(5, ev.getHoraFim());
				ps.setString(6, ev.getHoraInicio());
				ps.setString(7, ev.getNomeEvento());
				ps.setString(8, ev.getVagas());
				ps.setString(9, ev.getCargaHoraria());	
				ps.execute();
			}catch(Exception e) {
				System.out.println(e);
			}
		
		}


}

