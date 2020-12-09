package br.com.delete;





public class Delete_admin extends Delete {

	public Delete_admin(int id) {
		super(id);
		setIdTable("id_admin");
		setTable("administrador");
		delete();
	}

		
	
}
