package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);;
		marco.boire();
		Yakuza sun = new Yakuza("Sun Jin-Woo", "Whiskey", 30, "Ah-Jin");
		sun.extorquer(marco);
		sun.direBonjour();
		Ronin ronororoa = new Ronin("Ronoroa Zoro", "Alcool", 60);
		ronororoa.donner(10, marco);
		ronororoa.provoquer(sun);
	}
}
