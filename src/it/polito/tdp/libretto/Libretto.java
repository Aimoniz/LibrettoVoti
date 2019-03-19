package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	public Libretto() {
		this.voti=new ArrayList<Voto>();
	}
	
	public void add(int voto,String corso,LocalDate data) {
		
	}
	public void add(Voto v ) {
		voti.add(v);
		
	}
 
   public List<Voto> cercaVoti(int punti){
	   List<Voto> result=new ArrayList<Voto>();
	   for(Voto v:this.voti) {
		   if(v.getPunti()==punti) {
			   result.add(v);
		   }
	   }
	   return result;
   }
   
   public Voto  cercaEsame(String nomeEsame) {
	   Voto voto=new Voto(0,nomeEsame,null);
	  int pos= this.voti.indexOf(voto);
	  if(pos==-1) {
	   
		   return null;}
	  else {return this.voti.get(pos);}}
	
   public boolean esisteGiaVoto(Voto v)  {
	   
	   int pos=this.voti.indexOf(v);
	   if (pos==-1)
		   return false;
		   else {
			   if(v.getPunti()==this.voti.get(pos).getPunti())
				   return true ;
			   else
				   return true;
			   /*
						   
		   }
      Voto trovato=this.cercaEsame(v.getCorso());
      if(trovato==null)
    	  return false;
      if(trovato.getPunti()==v.getPunti()) {
    	  return true ;}
      else {return false;}
      }
   */
		   }
   }
}
