
public class Coordonnees {
	private int largeur;
	private int hauteur;
	
	public Coordonnees(int largeur, int hauteur){
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	public int getLargeur(){
		return this.largeur;
	}
	public int getHauteur(){
		return this.hauteur;
	}
	public String toString(){
		return "Largeur :"+largeur+"\tHauteur : "+hauteur;
	}
	//Deplace les coordonnées et retourne les nouvelles grace a l'objet placé en parametre(addition de coordonnées)
	public Coordonnees ajout(Coordonnees coord){
		this.hauteur+=coord.getHauteur();
		this.largeur+=coord.getLargeur();
		return new Coordonnees(this.largeur,this.hauteur);
}
}
