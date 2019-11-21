	package tp1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	
	private String  typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	Secteur(String type){
		animauxDansSecteur= new ArrayList<Animal>();
		this.typeAnimauxDansSecteur=type;
	}
	
	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}

	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}

	public void ajouterAnimal(Animal A) throws AnimalDansMauvaisSecteurException {
		if(A.typeAnimal.equals(this.typeAnimauxDansSecteur)) {
			this.animauxDansSecteur.add(A);
	}
		else {
			throw new AnimalDansMauvaisSecteurException();
		}
	}
	
	public int getNombreAnimaux() {
		return(this.animauxDansSecteur.size());
	}
	
	public String obtenirType() {
		return(this.typeAnimauxDansSecteur);
	}
}
