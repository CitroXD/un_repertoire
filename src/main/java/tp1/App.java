package tp1;

public class App {

	private static zoo Zoo;
	
	public static void main(String[] args) {
		Zoo=new zoo();
		Zoo.ajouterSecteur("Felin");
		Animal Lion=new Animal("Lion", "Felin");
		Zoo.nouvelAnimal(Lion);
		
		try {
		for(int i=0;i<15;i++) {
			Zoo.nouveauVisiteur();
			System.out.println("Visiteur n°"+(i+1));
			}
		Zoo.nouveauVisiteur();
		}
		catch(LimiteVisiteurException e) {
			e.printStackTrace();
		}

	}

}
