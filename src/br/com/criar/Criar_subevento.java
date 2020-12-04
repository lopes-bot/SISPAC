package br.com.criar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Subevento;

public class Criar_subevento {
	public Criar_subevento(){
		
		String sql = "INSERT INTO subevento (id_evento,id_subevento,CargaHoraria,NomeSubevento,endereco,HoraInicio,HoraFim,DataSub,Vagas) VALUES (?,?,?,?,?,?,?,?,?)";	
		Subevento sub = new Subevento(1, 1,"4", "O mercado dos jogos", "Rua joão carlos", "9:00", "12:00", "24/05/2021", "50");
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setInt(1, sub.getId_evento());
			ps.setInt(2, sub.getId_subevento());
			ps.setString(3, sub.getCargahoraria());
			ps.setString(4, sub.getNomesubevento());
			ps.setString(5, sub.getEndereco());
			ps.setString(6, sub.getHorainicio());
			ps.setString(7, sub.getHorafim());
			ps.setString(8, sub.getDatasub());
			ps.setString(9, sub.getVagas());				
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
			
	}
}
