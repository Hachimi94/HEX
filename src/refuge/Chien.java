package refuge;

public class Chien implements IAnimal{
	public String nom;
	public int an; 			// de naissance
	public boolean vacciné;
	
	public Chien(String nom, int an, boolean vacciné) {
		this.nom = nom;
		this.an = an;
		this.vacciné = vacciné;
	}

	@Override
	public void nourirAnimal() {
		System.out.println(" reçoit de la viande");
		
	}
}
