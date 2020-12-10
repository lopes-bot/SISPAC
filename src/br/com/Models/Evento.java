package br.com.Models;


public class Evento {
	private int id_evento;
	private String nomeEvento;
	private String endereco;
	private String dataAbertura;
	private String dataEncerra;
	private String horaInicio;
	private String horaFim;
	private String area;
	private String vagas;
	private String cargaHoraria;
	
	public Evento(int id_evento, String nomeEvento, String endereco, String dataAbertura, String dataEncerra,
			String horaInicio, String horaFim, String area, String vagas, String cargaHoraria) {
		this.id_evento = id_evento;
		this.nomeEvento = nomeEvento;
		this.endereco = endereco;
		this.dataAbertura = dataAbertura;
		this.dataEncerra = dataEncerra;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.area = area;
		this.vagas = vagas;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Evento(int id_evento) {
		this.id_evento = id_evento;
	}
	
	public int getId_evento() {
		return id_evento;
	}
	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getDataEncerra() {
		return dataEncerra;
	}
	public void setDataEncerra(String dataEncerra) {
		this.dataEncerra = dataEncerra;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getVagas() {
		return vagas;
	}
	public void setVagas(String vagas) {
		this.vagas = vagas;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Evento [id_evento=" + id_evento + ", nomeEvento=" + nomeEvento + ", endereco=" + endereco
				+ ", dataAbertura=" + dataAbertura + ", dataEncerra=" + dataEncerra + ", horaInicio=" + horaInicio
				+ ", horaFim=" + horaFim + ", area=" + area + ", vagas=" + vagas + ", cargaHoraria=" + cargaHoraria
				+ "]";
	}
	

	
		

}


