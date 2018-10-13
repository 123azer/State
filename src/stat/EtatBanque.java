package stat;

public interface EtatBanque{
//'Suppression'd'une'agence'de'la'banque'
public void delAgence(Agence agence);

//'Efface'la'banque'
public void delete();

//Ajoute'une'agence'à'la'banque'
public void addAgence(Agence agence);

//valide'les'informaGons'de'la'banque'
public void validate();}

