package br.com.editar;


public class Editar_evento extends UpdateAgenda {

	public Editar_evento(int id) {
		super(id);
		setIdTable("id_evento");
		setTable("evento");
		// TODO Auto-generated constructor stub
	}

	public void EditarDataInicio(String dataInicio) {
		String sql = "UPDATE  "+super.getTable()+" set datainicio =? WHERE "+ super.getIdTable() +"=?";
		update(dataInicio,sql);
		
		
	}
	public void EditarDataTermino(String dataTermino) {
		String sql = "UPDATE  "+super.getTable()+" set datafim =? WHERE "+ super.getIdTable() +"=?";
		update(dataTermino,sql);
		
	}
	public void EditarArea(String area) {
		String sql = "UPDATE  "+super.getTable()+" set area =? WHERE "+ super.getIdTable() +"=?";
		update(area,sql);
	}

}
