package br.com.editar;





public class Editar_palestrante extends UpdatePessoa {
	
	
	public Editar_palestrante(int id) {
		super(id);
		setIdTable("id_palestrante");
		setTable("palestrante");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void EditarSenha(String senha) {
		// TODO Auto-generated method stub
		System.out.println("Palestrante não possue senha");
	}

	@Override
	public void EditarNome(String nome) {
		// TODO Auto-generated method stub
		String sql = "UPDATE "+super.getTable()+" set  nomecompleto = ? WHERE "+super.getIdTable()+" = ?";
		update(nome,sql);
		
	}
	
	public void EditarTelefone(String telefone) {
		String sql = "UPDATE "+super.getTable()+" set  telefone = ? WHERE "+super.getIdTable()+" = ?";
		update(telefone,sql);
	}
	
	
	
		
		
		
	
}
