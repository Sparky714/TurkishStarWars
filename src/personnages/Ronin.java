package personnages;

public class Ronin extends Humain{
	private int honneur;

	public Ronin(String nom, String boisson, int moulaga) {
		super(nom, boisson, moulaga);
		this.honneur=1;
	}
	public void donner(int montant, Commercant commercant) {
		if(montant<=getMoulaga()) {
			perdreArgent(montant);
			parler("Tiens "+commercant.getNom()+", voilà "+montant+" sous.");
			commercant.recevoir(montant);
		}
	}
	public void provoquer(Yakuza yakuza) {
		if((2*honneur)>yakuza.getReputation()) {
			parler("Trop bien ! Merci pour la moula !");
			gagnerArgent(yakuza.getMoulaga());
			this.honneur+=1;
			yakuza.perdre();
		}
		else {
			parler("Je me suis fais arnaquer... LE MONDE EST CRUEL !");
			this.honneur-=50;
			yakuza.gagner();
		}
	}
}

