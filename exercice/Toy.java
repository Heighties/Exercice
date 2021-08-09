package fr.heighties.exercice;

//(d�but niveau 2 : cr�er une class "jouet"/"toy" pour avoir prix, description etc...)
public class Toy {

	// Attributs (les caract�ristiques) de la class

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

	// m�thodes :
	public String getNom() { // pour r�cup�rer nom du jouet
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
