package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;

	public Yakuza(String nom, String boisson, int moulaga, String clan) {
		super(nom, boisson, moulaga);
		this.reputation = 0;
		this.clan = clan;
	}
	public void extorquer(Commercant commercant) {
		parler("J’ai piqué le fric de "+commercant.getNom()+" !");
		commercant.seFaireExtorquer();
		gagnerArgent(commercant.getMoulaga());
	}
	public void gagner() {
		this.reputation+=1;
		parler("J'ai gagné ! Je suis un streumon, cheh bâtard !");
	}
	public int perdre() {
		parler("J’ai perdu mon duel et mes "+getMoulaga()+" sous, snif... Je déshonore le clan " + getClan());
		perdreArgent(getMoulaga());
		this.reputation-=1;
		return getMoulaga();
	}
	public int getReputation() {
		return reputation;
	}
	public String getClan() {
		return clan;
	}
	//surcharge de la méthode dire Bonjour
	public void direBonjour() { 
		super.direBonjour();
		super.parler("Mon clan est "+this.clan);
	}

}
