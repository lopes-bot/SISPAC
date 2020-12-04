package br.com.editar;

public class UpdatePessoa extends Update {
	private String idTable;
	private String table;
	
	public UpdatePessoa(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public void EditarEmail(String email) {
		String sql = "UPDATE "+this.table+" set email = ? WHERE "+this.idTable+" = ?";			
		update(email,sql);
		
	}
	
	public void EditarSenha(String senha) {
		String sql = "UPDATE "+this.table+" set senha = ? WHERE "+this.idTable+" = ?";
		update(senha,sql);
	}
	public void EditarNome(String nome) {
		String sql = "UPDATE "+this.table+" set  nome = ? WHERE "+this.idTable+" = ?";
		update(nome,sql);
	}
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getIdTable() {
		return idTable;
	}
	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}
	
	
	
}
