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
		
		Scanner s = new Scanner(System.in);  // on crée un objet scanner
		
		//1-Lecture du nom
		System.out.println("Donner votre nom");
		String nom = s.nextLine();
		
		//System.out.println("Vous avez taper : "+ nom);
		//2-Lecture de l'age
		System.out.println("Donner votre age");
		int age = s.nextInt();
		
		//3-Lecture de la moyenne
		System.out.println("Donner votre moyenne");
		double moy = s.nextDouble();
		
		s.nextLine(); //absorber le caractère d'échappement
		//4-Lecture de l'adresse
		System.out.println("Donner votre adresse");
		String adrs = s.nextLine();
		
		Etudiant e = new Etudiant(nom,age,moy,adrs);
		e.info();
		
	}

}
