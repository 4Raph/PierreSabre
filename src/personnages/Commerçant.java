package personnages;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		int argentExtorquer= argent;
		parler("J'ai tout perdu! Le monde est trop injuste..."); 
		this.argent = 0;
		return argentExtorquer;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie g�n�reux donateur!");
		this.argent+= argent;
	}

}
