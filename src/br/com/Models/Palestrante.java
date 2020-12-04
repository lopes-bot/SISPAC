package br.com.Models;

public class Palestrante {
	private int id_palestrante;
	private String nomecompleto;
	private String email;
	private String telefone;
	
	public Palestrante(int id_palestrante, String nomecompleto, String email, String telefone) {
		this.id_palestrante = id_palestrante;
		this.nomecompleto = nomecompleto;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Palestrante(int id_palestrante) {
		this.id_palestrante = id_palestrante;
	}

	public int getId_palestrante() {
		return id_palestrante;
	}

	public void setId_palestrante(int id_palestrante) {
		this.id_palestrante = id_palestrante;
	}

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Palestrante [id_palestrante=" + id_palestrante + ", nomecompleto=" + nomecompleto + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
	
}
