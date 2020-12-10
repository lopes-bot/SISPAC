package br.com.Models;

public class Gerenciapalestrante {
	private int id_subevento;
	private int id_palestrante;
	
	public Gerenciapalestrante(int id_subevento, int id_palestrante) {
		this.id_subevento = id_subevento;
		this.id_palestrante = id_palestrante;
	}

	public int getId_subevento() {
		return id_subevento;
	}

	public void setId_subevento(int id_subevento) {
		this.id_subevento = id_subevento;
	}

	public int getId_palestrante() {
		return id_palestrante;
	}

	public void setId_palestrante(int id_palestrante) {
		this.id_palestrante = id_palestrante;
	}

	@Override
	public String toString() {
		return "Gerenciapalestrante [id_subevento=" + id_subevento + ", id_palestrante=" + id_palestrante + "]";
	}
	
	
}
