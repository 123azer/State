package stat;

import java.util.ArrayList;
import java.util.Collection;

public class Bank {
	private Collection agences;
	private String etat;
	private String nom;
	
	public Bank() {
		super();
		this.agences = new ArrayList();
		this.etat=new String();
		this.nom=new String();
	}
	
	
	public Collection getAgences() {
		return agences;
	}



	public void setAgences(Collection agences) {
		this.agences = agences;
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public void validate(){ 
		if (this.getEtat()=="NonInitialisee")
		{ if (this.getNom()!=null)
		   {
		      this.setEtat("valide");
			  System.out.println("la banque est en etat valide");	
		   }
		  else 
			  System.out.println("impossible,la banque doit avoir un nom");
		}
		else {
			if(this.getEtat()=="valide")
			  System.out.println("la banque est deja dans un autre etat valide");
			else
				System.out.println("la banque a des agences");
		}
		}
	
	
	
	public void addAgence(Agence agence)  { /*les cas*/ }
	public void delAgence(Agence agence){ /*les cas*/ }
	public void delete(){  /*les cas*/}
	
	
	
	
	
	
	

}
