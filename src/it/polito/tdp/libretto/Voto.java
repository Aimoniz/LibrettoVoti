package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private int voto;
	private String corso;
	private LocalDate date;
	public Voto(int voto, String corso, LocalDate date) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Voto [voto=" + voto + ", corso=" + corso + ", date=" + date + "]";
	}

	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	

}
