package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		//Création du premier étudiant
		// e1 et e2 sont des références sur des objets de types étudiants
		Etudiant e1 = new Etudiant(); // invocation(appel) du constructeur par défaut
		e1.info();
		//Création du deuxième étudiant
		
		Etudiant e2 = new Etudiant("Fayçal",21,16.5,"Cité el Khadra");
		e2.info();
		 */
		
		Etudiant e = new Etudiant();
		
		Scanner s = new Scanner(System.in);  // on crée un objet scanner
		
		//1-Lecture du nom
		System.out.println("Donner votre nom");
		String nom = s.nextLine();
		e.setNom(nom);
		
		//System.out.println("Vous avez taper : "+ nom);
		//2-Lecture de l'age
		System.out.println("Donner votre age");
		int age = s.nextInt();
		e.setAge(age);
		//3-Lecture de la moyenne
		System.out.println("Donner votre moyenne");
		double moy = s.nextDouble();
		e.setMoyenne(moy);
		
		s.nextLine(); //absorber le caractère d'échappement
		//4-Lecture de l'adresse
		System.out.println("Donner votre adresse");
		String adrs = s.nextLine();
		e.setAdresse(adrs);
		
		e.info();
		
		//Etudiant e = new Etudiant();
		//e.info();
		//e.nom = "Mohamed";
		//e.age = -3005;
		//e.setAge(20);
		//e.setMoyenne(15.6);
		//e.setNom("Mohamed Amine Mezghich");
		//e.info();
	}

}
