package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson_favorite, int argent, String clan) {
		super(nom, boisson_favorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commer�ant victime) {
		int argentExtorquer;
		parler("Tiens, tiens ne serait-ce pas un faible marchant qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		argentExtorquer = victime.seFaireExtorquer();
		reputation++;
		this.argent+=argentExtorquer;
		parler("J'ai piqu� les "+ argentExtorquer + " sous de " + victime.getNom() + ", ce sui me fait "+ argent + " sous dans ma poche. Hi ! Hi !");
		
	}
}
