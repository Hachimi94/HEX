package refuge;
import java.util.Scanner;
public class Refuge {
	private  IAnimal[] animaux = new IAnimal[15];
	private int nbAnimaux = 0;
	private  Scanner sc;	
	public void session() {
		sc = new Scanner(System.in);
		String choix = "oui";
		while (choix.equals("oui")) {
			System.out.println("Voulez-vous ajouter un animal ?");
			while (true) {
				choix = sc.nextLine();
				 if (choix.equals("oui") || choix.equals("non"))
					 break;
				 else System.out.println("oui ou non ?");
			}
			if (choix.equals("oui"))
				ajouterAnimal();
		}
		sc.close();
		lesAnimauxCrient();
		nourrirLesAnimaux();
	}
	
	public void nourrirLesAnimaux() {
		for (int i =0; i< nbAnimaux ; i++) {
			animaux[i].nourirAnimal();
		}
	}
	
	public void ajouterAnimal() {
		System.out.println("Arriv�e d'un animal");
		System.out.println("chien ou chat ?");
		String espece;
		while (true) {
			espece = sc.nextLine();
			 if (espece.equals("chien") || espece.equals("chat"))
				 break;
			 else System.out.println("Entrez chien ou chat uniquement\n");
		}
		if (nbAnimaux >= 15) {
			System.out.println("Il n'y a plus de place , d�sol�.");
			return;
		}
		
		System.out.println("Entrez le nom de l'animal : ");
		String nom = sc.nextLine();
		System.out.println("Entrez l'ann�e de naissance de l'animal : ");
		int ann�e = sc.nextInt();
		if (espece.equals("chien")) {
			String vaccin�;
			System.out.println("Le chien est il vaccin� ?");
			while (true) {
				vaccin� = sc.nextLine();
				 if (vaccin�.equals("oui") || vaccin�.equals("non"))
					 break;
				 else System.out.println("oui ou non ?");
			}
			chiens[nbChiens++]= new Chien(nom, ann�e, vaccin�.equals("oui"));
		} else
			chats[nbChats++] = new Chat(nom, ann�e);
	}	
	public void lesAnimauxCrient() {
		for (int i =0; i< nbChiens; ++i)
			System.out.println(chiens[i].nom + " aboie");
		for (int i =0; i< nbChats; ++i)
			System.out.println(chats[i].nom + " miaule"); 
	}
	
	
	
	
	
	
	
	
	
	}