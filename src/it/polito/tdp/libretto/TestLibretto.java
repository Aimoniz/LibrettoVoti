package it.polito.tdp.libretto;

import java.util.*;
import java.time.LocalDate;

public class TestLibretto {
	public static void main(String[] args) {
		Libretto libr=new Libretto();
		libr.add(new Voto(30,"Analisi I",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21,"Analisi II",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(25,"Fisica I",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(28,"Fisica II",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(18,"Geometria",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(20,"Economia",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(25,"Ricerca operativa",LocalDate.of(2018, 6, 5)));
		libr.add(new Voto(24,"Complementi di economia",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(25,"Logistica",LocalDate.of(2019, 2, 15)));
		libr.add(new Voto(27,"Programmazione ad oggetti",LocalDate.of(2019, 1, 15)));
		
		List<Voto> venticinque=libr.cercaVoti(25);
		System.out.println(venticinque);
		Voto a1=libr.cercaEsame("Analisi I");
		Voto a3=libr.cercaEsame("analisi III");
		System.out.println(a1);
		System.out.println(a3);
		
		Voto giusto=new Voto(18,"Geometria",LocalDate.now());
		Voto sbagliato=new Voto(28,"Geometria",LocalDate.now());
		Voto mancante=new Voto(30,"merendine",LocalDate.now());
		
		System.out.format("Il voto %s � %s \n",giusto.toString(),libr.esisteGiaVoto(giusto));
		System.out.format("Il voto %s � %s \n",sbagliato.toString(),libr.esisteGiaVoto(sbagliato));
		System.out.format("Il voto %s � %s \n",sbagliato.toString(),libr.votoConflitto(sbagliato));
		System.out.println(libr.add(giusto));
		System.out.println(libr.add(sbagliato));
		System.out.println(libr.add(mancante));
	  System.out.println(libr.toString());
	  System.out.println("**Migliora***");
	  Libretto migliore=libr.LibrettoMigliorato();
	  System.out.println((libr.toString()));
	  System.out.println(migliore.toString());
	  
	}
}
