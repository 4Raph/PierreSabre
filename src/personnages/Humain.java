package personnages;

public class Humain {
	protected String nom;
	protected String boisson_favorite;
	protected int argent;
	
	public Humain(String nom,String boisson_favorite ,int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson_favorite= boisson_favorite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_favorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson_favorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent<prix) {
			parler("Je n'ai plus que "+ argent + " sous en poche. Je ne peux même pas m'offrir "+ bien + " à "+ prix + " sous");
		}
		else {
			parler("J'ai "+ argent +" sous en poche. Je vais pouvoir m'offrir "+ bien + " à " + prix + " sous");
			argent=argent-prix;
		}
	}
	
//	public void gagnerArgent(int gain) {
//		
//	}
//	
//	public void perdreArgent(int perte) {
//		
//	}

}
