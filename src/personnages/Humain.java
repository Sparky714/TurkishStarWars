package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int moulaga;

	public Humain(String nom, String boisson, int moulaga) {
		this.nom = nom;
		this.boisson = boisson;
		this.moulaga = moulaga;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getMoulaga() {
		return moulaga;
	}
	
	public int gagnerArgent(int montant) {
		return this.moulaga += montant;
	}
	
	public int perdreArgent(int montant) {
		if(montant > this.moulaga) {
			parler("Oh non je ne peux pas me prendre ceci...");
			return moulaga;
		}else {
		return this.moulaga -= montant;
		
	}
	}
	
	public void acheter(String bien, int pognon) {
		if(pognon > moulaga) {
			parler("Je n'ai plus que " + moulaga + "sous en poche. Je ne peux même pas m'offrir un " + bien + "à " + pognon);
		}else {
			parler("J'ai " + moulaga + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + pognon + "sous.");
		}
	}
}
