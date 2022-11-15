package histoire;
import personnages.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant louis = new Commercant("Louis", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza ayman = new Yakuza("Ayman", "Whiskey", 30, "Calvitie");
		Ronin ronororoa = new Ronin("Ronoroa Zoro", "Alcool", 60);
		Samourai alex = new Samourai("Alex", "Blanche", 5000, "Flavien");

		louis.faireConnaissance(ronororoa);
		louis.faireConnaissance(ayman);
		louis.faireConnaissance(chonin);
		louis.faireConnaissance(kumi);
		louis.listerConnaissance();
		ronororoa.listerConnaissance();
		ayman.listerConnaissance();
		alex.faireConnaissance(louis);
		alex.listerConnaissance();
		alex.boire();
	}
}
