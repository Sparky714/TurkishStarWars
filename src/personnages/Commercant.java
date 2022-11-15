package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int moulaga) {
		super(nom, "th�", moulaga);
	}
	public int seFaireExtorquer() {
		int montant = this.getMoulaga();
		parler("J�ai tout perdu! Le monde est trop injuste...");
		this.perdreArgent(montant);;
		return montant;
	}
	public void recevoir(int argent) {
		parler("Je te remercie g�n�reux donateur pour ce don de " + argent + "! Je n'ai plus a faire la manche devant le m�tro avec ma pancarte de merde !");
		gagnerArgent(argent);
	}
}

