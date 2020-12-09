package br.com.delete;

;

public class Delete_evento extends Delete{

	public Delete_evento(int id) {
		super(id);
		setIdTable("id_evento");
		setTable("evento");
		delete();
	}

	
	
}
