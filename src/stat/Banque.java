package stat;

import java.util.*;
public class Banque{
private Collection agences;
private EtatBanque etat;
private String nom;
public Banque(){
etat =new EtatBanqueNonInitialisee(this);
agences=new ArrayList();}

public EtatBanque getEtat() {
	return etat;
}
public void setEtat(EtatBanque etat) {
	this.etat=etat;
}
public void setNom(String string){nom=string;}
public String getNom() { return nom;}

public void validate(){ etat.validate(); }
public void addAgence(Agence agence)  { etat.addAgence(agence); }
public void delAgence(Agence agence){ etat.delAgence(agence); }
public void delete(){  etat.delete();}
public Collection getAgences() {  return agences; }
public void setAgences(Collection collection) {  agences = collection; }

}