package br.com.editar;

public class UpdateAgenda extends Update{
	private String idTable;
	private String table;
	public UpdateAgenda(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public void EditarCargaHoraria(String cargaHoraria) {
		String sql = "UPDATE "+this.table+" set  cargahoraria =? WHERE "+ this.idTable +"=?";
		update(cargaHoraria,sql);
		
	}
	public void EditarNome(String nomeEvento) {
		String sql = "UPDATE "+this.table+" set  nomeevento =? WHERE " + this.idTable +"=?";
		update(nomeEvento,sql);
	}
	public void EditarEndereco(String endereco) {
		String sql = "UPDATE "+this.table+"  set  endereco =? WHERE "+ this.idTable +"=?";
		update(endereco,sql);
		
	}
	public void EditarHoraInicio(String horaInicio) {
		String sql = "UPDATE "+this.table+"  set  horainicio =? WHERE "+ this.idTable +"=?";
		update(horaInicio,sql);
		
	}
	public void EditarHoraTermino(String horatermino) {
		String sql = "UPDATE  "+this.table+" set  horafim =? WHERE "+ this.idTable +"=?";
		update(horatermino,sql);
		
	}
	
	public void EditarVagas(String vagas) {
		String sql = "UPDATE  "+this.table+" set  vagas =? WHERE "+ this.idTable +"=?";
		update(vagas,sql);
		
	}
	public String getIdTable() {
		return idTable;
	}
	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
}
