package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Editar_evento {
	
	public Editar_evento(){
		
		String sql = "UPDATE  evento set  cargahoraria =?,nomeevento =?,endereco =?,horainicio =?,horafim =?, datainicio =?, datafim =?, area =?, vagas =? WHERE id_evento =? ";	
		Evento ev = new Evento(1,"feira de ciências", "escola estadual do RN","24/04/2021","27/05/2021" ,"09:00","12:00","tecnologia","1000", "200" );
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, ev.getCargaHoraria());
			ps.setString(2, ev.getNomeEvento());
			ps.setString(3, ev.getEndereco());
			ps.setString(4, ev.getHoraInicio());
			ps.setString(5, ev.getHoraFim());
			ps.setString(6, ev.getDataAbertura());
			ps.setString(7, ev.getDataEncerra());
			ps.setString(8, ev.getArea());				
			ps.setString(9, ev.getVagas());
			ps.setInt(10, ev.getId_evento());
			ps.execute();
			ps.close();

		}catch(Exception e) {
			System.out.println(e);
		}
			
	}

}
