package br.com.Models;

public class Subevento {
	private int id_evento;
	private int id_subevento;
	private String cargahoraria;
	private String nomesubevento;
	private String endereco;
	private String horainicio;
	private String horafim;
	private String datasub;
	private String vagas;
	public Subevento(int id_evento, int id_subevento, String cargahoraria, String nomesubevento, String endereco,
			String horainicio, String horafim, String datasub, String vagas) {
		this.id_evento = id_evento;
		this.id_subevento = id_subevento;
		this.cargahoraria = cargahoraria;
		this.nomesubevento = nomesubevento;
		this.endereco = endereco;
		this.horainicio = horainicio;
		this.horafim = horafim;
		this.datasub = datasub;
		this.vagas = vagas;
	}
	public int getId_evento() {
		return id_evento;
	}
	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
	}
	public int getId_subevento() {
		return id_subevento;
	}
	public void setId_subevento(int id_subevento) {
		this.id_subevento = id_subevento;
	}
	public String getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public String getNomesubevento() {
		return nomesubevento;
	}
	public void setNomesubevento(String nomesubevento) {
		this.nomesubevento = nomesubevento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}
	public String getHorafim() {
		return horafim;
	}
	public void setHorafim(String horafim) {
		this.horafim = horafim;
	}
	public String getDatasub() {
		return datasub;
	}
	public void setDatasub(String datasub) {
		this.datasub = datasub;
	}
	public String getVagas() {
		return vagas;
	}
	public void setVagas(String vagas) {
		this.vagas = vagas;
	}
	
	@Override
	public String toString() {
		return "Subevento [id_evento=" + id_evento + ", id_subevento=" + id_subevento + ", cargahoraria=" + cargahoraria
				+ ", nomesubevento=" + nomesubevento + ", endereco=" + endereco + ", horainicio=" + horainicio
				+ ", horafim=" + horafim + ", datasub=" + datasub + ", vagas=" + vagas + "]";
	}	
	
}
