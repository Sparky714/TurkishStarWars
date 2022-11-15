package personnages;

public class Traitre extends Humain{
	
	private int traitrise;
	
	public Traitre(String nom, String boisson, int moulaga){
		super(nom, boisson, moulaga);
		this.traitrise = 0;
	}
	
	public void extorquer(Commercant commercant){
		if(this.traitrise < 3){
			parler("Ordre de moi, donnez moi toute votre moula");
			this.traitrise +=1;
			gagnerArgent(commercant.seFaireExtorquer());
		}else{
			parler("Mon niveau est trop bon, je me sais remarqué, je ne peux extorquer...");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traitrise est de "+this.traitrise);
	}

	public void faireLeGentil(Humain humain){
			parler("Tient " + humain.getNom()+"prends donc cette moulaga");
			this.perdreArgent(moulaga);
			humain.gagnerArgent(montant);
			if ((montant/10)<this.traitrise) {
				this.traitrise-=montant/10;
			}
		}
	}
}
