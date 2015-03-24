
public abstract class Cellule {
	protected int mine =0;
	protected int base=0;
	String image;
	Coordonnees coo;
	Robot rob;
	
	public Cellule(int largeur, int hauteur){
		coo = new Coordonnees(largeur, hauteur);
	}
	public int contientMine(){
		return this.mine;
	}
	public int estBase(){
		return this.base;
	}
	public Coordonnees getCoo() {
		return coo;
	}
	public Robot getContenu(){
		return rob;
	}
	public String toString(){
		return "Hauteur : "+ coo.getHauteur() + ", largeur : " + coo.getLargeur() + ", mine : "+mine+", base : "+base;
	}
	

}
