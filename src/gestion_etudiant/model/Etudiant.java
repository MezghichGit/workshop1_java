package gestion_etudiant.model;

public class Etudiant {
	String nom;
	int age;
	double moyenne;
	String adresse;
	
	public void info()
	{
		System.out.println("Nom = "+this.nom+" Age = "+this.age+" Moyenne = "+this.moyenne+" Adresse = "+this.adresse);
	}
	public Etudiant() {  // constructeur par défaut
	 System.out.println("Constructeur par défaut");	
	}
	public Etudiant(String nom, int age, double moyenne, String adresse) { //constructeur avec paramètres
		 System.out.println("Constructeur avec paramètres");	
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}
}
