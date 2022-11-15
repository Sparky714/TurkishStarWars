package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int moulaga;
	private Humain [] memoire = new Humain [30];
	private int nbHumains;

	public Humain(String nom, String boisson, int moulaga) {
		this.nom = nom;
		this.boisson = boisson;
		this.moulaga = moulaga;
	}

	protected void parler(String texte) {
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

	protected int gagnerArgent(int montant) {
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
			parler("Je n'ai plus que " + moulaga + " sous en poche. Je ne peux même pas m'offrir un " + bien + "à " + pognon);
		}else {
			parler("J'ai " + moulaga + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + pognon + " sous.");
			moulaga -= pognon;
		}
	}

	public void faireConnaissance(Humain humain){
		this.direBonjour();
		humain.repondre(humain);
		this.memoriser(humain);
		humain.memoriser(this);
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	private void memoriser(Humain humain) {
		if(nbHumains < 30){
			this.memoire[this.nbHumains] = humain;
			this.nbHumains += 1;
		}
		else{
			parler("Je t'ai déjà vu ?");
		}
	}
	
	public void listerConnaissance() {
		String blabla = "Je connais beaucoup de gens dont : ";
		if(this.memoire[0] == null) {
			this.parler("Olala je ne connais personne, quelle grosse merde...");
		}else {
			for(int i = 0; i < nbHumains; i++) {
				if(this.memoire[i] == null) {
					this.parler(blabla);
					return;
				}else {
					blabla += this.memoire[i].getNom() + ", ";
				}
			}
			this.parler(blabla);
		}
	}
}
