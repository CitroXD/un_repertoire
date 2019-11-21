package tp1;

public class Animal {

	protected String nomAnimal;
	protected String typeAnimal;
	
	Animal(String nom, String type){
		this.nomAnimal=nom;
		this.typeAnimal=type;
	}
	
	public String getNomAnimal() {
		return(this.nomAnimal);
	}
	
	public String getTypeAnimal() {
		return(this.typeAnimal);
	}
	
}
