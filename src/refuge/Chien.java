package refuge;

public class Chien implements IAnimal{
	public String nom;
	public int an; 			// de naissance
	public boolean vaccin�;
	
	public Chien(String nom, int an, boolean vaccin�) {
		this.nom = nom;
		this.an = an;
		this.vaccin� = vaccin�;
	}

	@Override
	public void nourirAnimal() {
		System.out.println(" re�oit de la viande");
		
	}
}
