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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		return true;
	}
	
	
	

}
