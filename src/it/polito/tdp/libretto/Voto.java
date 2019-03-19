package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private int punti;
	private String corso;
	private LocalDate date;
	public Voto(int voto, String corso, LocalDate date) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Voto [voto=" + punti + ", corso=" + corso + ", date=" + date + "]";
	}
	

	public int getPunti() {
		return punti;
	}
	public void setPunti(int voto) {
		this.punti = voto;
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
	 public Voto clone() {
		 return new Voto(this.punti,this.corso,this.date);
	 }
	
	

}
