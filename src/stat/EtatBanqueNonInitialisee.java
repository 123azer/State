package stat;

public class EtatBanqueNonInitialisee implements EtatBanque { 
private final Banque banque;
public EtatBanqueNonInitialisee(Banque banque) { 
this.banque=banque;}
public void delAgence(Agence agence) {
	System.out.println("impossible,la banque en etat non valide");	
}
public void addAgence(Agence agence) {
	System.out.println("impossible,la banque en etat non valide");	
}
public void validate() {
if (banque.getNom()!=null)
{
    banque.setEtat(new EtatBanqueInitialisee(banque));
	System.out.println("la banque est en etat valide");	
}
else
	System.out.println("impossible,la banque doit avoir un nom");	
}
@Override
public void delete() {
	System.out.println("impossible,la banque en etat non valide");	
}
}