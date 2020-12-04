package br.com.criar;


import java.sql.PreparedStatement;


import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Criar_evento {
	public Criar_evento(){
			
			String sql = "INSERT INTO evento (id_evento,CargaHoraria,NomeEvento,endereco,HoraInicio,HoraFim,DataInicio,DataFIM,Area,Vagas) VALUES (?,?,?,?,?,?,?,?,?,?)";	
			Evento ev = new Evento(1,"Inteligencia artificial 3", "avenida augusta","24/04/2021","27/05/2021" ,"08:00","19:00","tecnologia","1000", "200" );
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps =con.getPs();
			try {
				ps.setInt(1, ev.getId_evento());
				ps.setString(2, ev.getCargaHoraria());
				ps.setString(3, ev.getNomeEvento());
				ps.setString(4, ev.getEndereco());
				ps.setString(5, ev.getHoraInicio());
				ps.setString(6, ev.getHoraFim());
				ps.setString(7, ev.getDataAbertura());
				ps.setString(8, ev.getDataEncerra());
				ps.setString(9, ev.getArea());				
				ps.setString(10, ev.getVagas());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
				
		}

}

