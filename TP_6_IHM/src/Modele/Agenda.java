package Modele;

import java.io.Serializable;

public class Agenda implements Serializable{

	Evenement [] chEvts;
	private int chNbEvt;
	private int chTailleTab;

	public Agenda(int parTaille){
		
		chEvts = new Evenement [parTaille];
		chTailleTab = parTaille;
		chNbEvt = 0;
	}
	public int getTaille() {
		return chTailleTab;
	}
	public boolean ajout(Evenement parEvt){

		if(chNbEvt < chTailleTab)
		{
			chEvts[chNbEvt]=parEvt;
			chNbEvt++;	
			return true;
		}
		else
			return false;

	}	
	
	public int getEvenement(Evenement parEvt){
		
		int indice = 0;
		
		if(chNbEvt == 0)
			return -1;
		
		while(parEvt.compareTo(chEvts[indice])!=0)
		{
			indice++;
			if(indice == chNbEvt)
				return -1;
		}
		
		return indice;
			
	}
	
	public String toString(){
		
		String stringAgenda="[";
		int indice = 0;
		for(indice=0;indice<chNbEvt;indice++)
			stringAgenda = stringAgenda +"|EVENEMENT:|"+chEvts[indice].toString();
		
		stringAgenda = stringAgenda + "]";
		
		return stringAgenda;
	}
	
	
	public int rechercheMinimum(int parDebut, int parFin){
		
		int indice = parDebut;
		int minimum;
		minimum = indice;
		for(indice=parDebut;indice+1<=parFin;indice++)
		{
			if(chEvts[indice].compareTo(chEvts[indice+1])==-1)
				minimum = indice+1;
			
			System.out.println(chEvts[indice].compareTo(chEvts[indice+1])+"|"+indice);
		}
		
		return minimum;
	}

	public Evenement[] getEvtMois(int mois) {
		Evenement []tabEvt = new Evenement[chTailleTab];
		for(int i=0; i<chTailleTab;i++) {
			if(chEvts[i]!=null)
			{
				if(chEvts[i].getDate().getMois()==mois)
				{
					
				}
			}
		}
		
		return tabEvt;
		
	}
	public Evenement [] getTabEvt() {
		return chEvts;
	}
}
