package br.com.editar;

import java.sql.PreparedStatement;

import br.com.Dbconnect.ConnectDb;
import br.com.Models.Evento;

public class Editar_evento {
	private int id_evento;
	protected String ID = "id_evento";
	
	public Editar_evento(int id_evento){
		this.id_evento = id_evento;
		/*
		String sql = "UPDATE  evento set  area =?, vagas =? WHERE id_evento =? ";	
		
		
	*/
			
	}
	public void EditarCargaHoraria(String cargaHoraria) {
		String sql = "UPDATE  evento set  cargahoraria =? WHERE "+ this.ID +"=?";
		update(cargaHoraria,sql);
		
	}
	public void EditarNome(String nomeEvento) {
		String sql = "UPDATE  evento set  nomeevento =? WHERE " + this.ID +"=?";
		update(nomeEvento,sql);
	}
	public void EditarEndereco(String endereco) {
		String sql = "UPDATE  evento set  endereco =? WHERE "+ this.ID +"=?";
		update(endereco,sql);
		
	}
	public void EditarHoraInicio(String horaInicio) {
		String sql = "UPDATE  evento set  horainicio =? WHERE "+ this.ID +"=?";
		update(horaInicio,sql);
		
	}
	public void EditarHoraTermino(String horatermino) {
		String sql = "UPDATE  evento set  horafim =? WHERE "+ this.ID+"=?";
		update(horatermino,sql);
		
	}
	public void EditarDataInicio(String dataInicio) {
		String sql = "UPDATE  evento set datainicio =? WHERE "+ this.ID +"=?";
		update(dataInicio,sql);
		
		
	}
	public void EditarDataTermino(String dataTermino) {
		String sql = "UPDATE  evento set datafim =? WHERE "+this.ID +"=?";
		update(dataTermino,sql);
		
	}
	public void EditarArea(String area) {
		String sql = "UPDATE  evento set area =? WHERE "+this.ID +"=?";
		update(area,sql);
	}
	public void EditarVagas(String vagas) {
		String sql = "UPDATE  evento set  vagas =? WHERE "+this.ID +"=?";
		update(vagas,sql);
		
	}
	public int getId_evento() {
		return id_evento;
	}

	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
	}
	
	public void update(String valor, String sql) {
		ConnectDb con = new ConnectDb(sql);
		PreparedStatement ps =con.getPs();
		try {
			ps.setString(1, valor);	
			ps.setInt(2,getId_evento());
			ps.execute();
			ps.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
