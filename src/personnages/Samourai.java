package personnages;

import java.util.Random;

public class Samourai extends Humain{
	private String seigneur;

	public Samourai(String nom, String boisson, int moulaga, String seigneur) {
		super(nom, boisson, moulaga);
		this.seigneur = seigneur;
	}

	//surcharge de la méthode dire Bonjour
	@Override
	public void direBonjour() { 
		super.direBonjour();
		super.parler("Je sers le noble seigneur "+this.seigneur);
	}
	
	@Override
	public void boire() {
		String[] boisson = {"thé","bière", "coca bien frais chacal"};
		Random rand = new Random();
		int trand = rand.nextInt(3);
		parler("Mmmm, un bon verre de " + boisson[trand] + " ! GLOUPS !");
	}
}
