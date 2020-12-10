package br.com.editar;


public class Editar_subevento extends UpdateAgenda {

	public Editar_subevento(int id) {
		super(id);
		setIdTable("id_subevento");
		setTable("subevento");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void EditarNome(String nomeSubevento) {
		// TODO Auto-generated method stub
		String sql = "UPDATE "+super.getTable()+" set  nomesubevento =? WHERE " + super.getIdTable() +"=?";
		update(nomeSubevento,sql);
	}
	
	public void EditarData(String data) {
		String sql = "UPDATE "+super.getTable()+" set  datasub =? WHERE " + super.getIdTable() +"=?";
		update(data,sql);
	}
			//String sql = "UPDATE  subevento set  cargahoraria = ?,nomesubevento = ?, endereco = ?,horainicio = ?, horafim =?,datasub = ?,vagas =? WHERE id_subevento =?";	
		
				
}
