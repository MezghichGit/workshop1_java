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
	public Etudiant() {  // constructeur par d�faut
	 System.out.println("Constructeur par d�faut");	
	}
	public Etudiant(String nom, int age, double moyenne, String adresse) { //constructeur avec param�tres
		 System.out.println("Constructeur avec param�tres");	
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}
}
