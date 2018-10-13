package stat;
public class EtatBanqueADesAgences implements EtatBanque {
private final Banque banque;
public EtatBanqueADesAgences(Banque banque) {
this.banque=banque;
}
@Override
public void delAgence(Agence agence) {
	banque.getAgences().remove(agence);
	if (banque.getAgences().isEmpty()){
		banque.setEtat(new EtatBanqueInitialisee(banque));}
	}
@Override
public void delete() {	
	System.out.println("impossible,la banque a des agences");
	}
@Override
public void validate() {
	System.out.println("pas de validation,la banque a des agences");
}

public void addAgence(Agence agence) {
	banque.getAgences().add(agence);
}
}