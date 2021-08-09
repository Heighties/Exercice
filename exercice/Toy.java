package fr.heighties.exercice;

//(début niveau 2 : créer une class "jouet"/"toy" pour avoir prix, description etc...)
public class Toy {

	// Attributs (les caractéristiques) de la class

	private String nom; // nom du jouet
	private int prix; // prix du jouet
	private String description; // descriprtion du jouet
	private int promo; // promotion du jouet

	// Constructeur
	public Toy(String nom, int prix, String description, int promo) {
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.promo = promo;
	}

	// méthodes :
	public String getNom() { // pour récupérer nom du jouet
		return nom; // permet de renvoyer la valeur

	}

	public int getPrix() {
		return prix;
	}

	public String getDesc() {
		return description;
	}

	public int getPromo() {
		return promo;

	}

}
