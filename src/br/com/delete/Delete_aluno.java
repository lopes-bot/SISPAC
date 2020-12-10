package br.com.delete;



public class Delete_aluno extends Delete {

	public Delete_aluno(int id) {
		super(id);
		setIdTable("id_aluno");
		setTable("aluno");
		delete();
	}
	
}
