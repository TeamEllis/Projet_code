
public abstract class Robot {
	private int equipe,energie;
	private Vue vue;
	private Coordonnees coo;
	
	
	//ajouter vue quand la classe sera créée
	public Robot(Vue vue, int l, int h, int equipe){
		coo= new Coordonnees(l,h);
		this.equipe=equipe;
	}
	abstract public boolean peutTirer();
	
	public boolean estSurBase(){
		if(equipe==0 && coo.getLargeur()==0 && coo.getHauteur()==0){
			return true;
		}
		else if (equipe==1 && coo.getLargeur()==)
	
		
	}

}
