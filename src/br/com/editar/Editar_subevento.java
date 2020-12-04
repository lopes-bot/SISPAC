package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Subevento;

public class Editar_subevento {
	public Editar_subevento(){
			
			String sql = "UPDATE  subevento set  cargahoraria = ?,nomesubevento = ?, endereco = ?,horainicio = ?, horafim =?,datasub = ?,vagas =? WHERE id_evento =?";	
			Subevento sub = new Subevento(1,"4", "O mercado dos jogos", "Rua joão carlos", "9:00", "12:00", "24/05/2021", "50");
			ConnectDb con = new ConnectDb(sql);
			PreparedStatement ps =con.getPs();
			try {
				ps.setString(1, sub.getCargahoraria());
				ps.setString(2, sub.getNomesubevento());
				ps.setString(3, sub.getEndereco());
				ps.setString(4, sub.getHorainicio());
				ps.setString(5, sub.getHorafim());
				ps.setString(6, sub.getDatasub());
				ps.setString(7, sub.getVagas());
				ps.setInt(8, sub.getId_subevento());
				ps.execute();
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
				
		}
}
