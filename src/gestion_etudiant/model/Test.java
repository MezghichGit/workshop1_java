package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		//Cr�ation du premier �tudiant
		// e1 et e2 sont des r�f�rences sur des objets de types �tudiants
		Etudiant e1 = new Etudiant(); // invocation(appel) du constructeur par d�faut
		e1.info();
		//Cr�ation du deuxi�me �tudiant
		
		Etudiant e2 = new Etudiant("Fay�al",21,16.5,"Cit� el Khadra");
		e2.info();
		 */
		
		Scanner s = new Scanner(System.in);  // on cr�e un objet scanner
		
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
		
		s.nextLine(); //absorber le caract�re d'�chappement
		//4-Lecture de l'adresse
		System.out.println("Donner votre adresse");
		String adrs = s.nextLine();
		
		Etudiant e = new Etudiant(nom,age,moy,adrs);
		e.info();
		
	}

}
