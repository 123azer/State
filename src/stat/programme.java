package stat;

public class programme {

	public static void main(String[] args) {
	 Banque banque=new Banque();
	 Agence agence=new Agence();
	 banque.delete();
	 banque.validate();
	 banque.setNom("BMCE");
	 banque.validate();
	 banque.addAgence(agence);
	 banque.delete();
	 banque.delAgence(agence);
	 banque.delete();
	}

}
