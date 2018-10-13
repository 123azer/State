package stat;

public class EtatBanqueInitialisee implements EtatBanque {
private Banque banque;
public EtatBanqueInitialisee(Banque banque) {
this.banque =banque;
}
public void delAgence(Agence agence) {
	System.out.println("impossible,la banque en etat valide");
}
public void addAgence(Agence agence) {
banque.getAgences().add(agence);
banque. setEtat(new EtatBanqueADesAgences(banque));
}
public void validate() {
	System.out.println("la banque en etat non valide");
}
public void delete() {
	banque=null;
	System.out.println("la banque est supprimée");
}
}
