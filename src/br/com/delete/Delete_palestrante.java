package br.com.delete;


public class Delete_palestrante extends Delete {

	public Delete_palestrante(int id) {
		super(id);
		setIdTable("id_palestrante");
		setTable("palestrante");
		delete();
	}
	
}
