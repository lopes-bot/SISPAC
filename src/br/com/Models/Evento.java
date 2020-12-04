package br.com.Models;

import java.util.Date;

public class Evento {
	private String nomeEvento;
	private String endereco;
	private Date dataAbertura;
	private Date dataEncerra;
	private Date horaInicio;
	private Date horaFim;
	private String area;
	private String vagas;
	private String cargaHoraria;
	
	
	
	
	public Evento(String nomeEvento, String endereco, Date dataAbertura, Date dataEncerra, Date horaInicio,
			Date horaFim, String area, String vagas, String cargaHoraria) {
		super();
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
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataEncerra() {
		return dataEncerra;
	}
	public void setDataEncerra(Date dataEncerra) {
		this.dataEncerra = dataEncerra;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(Date horaFim) {
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
		return "Evento [nomeEvento=" + nomeEvento + ", endereco=" + endereco + ", dataAbertura=" + dataAbertura
				+ ", dataEncerra=" + dataEncerra + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", area="
				+ area + ", vagas=" + vagas + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
				
	
}


