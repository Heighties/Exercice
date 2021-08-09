package fr.heighties.exercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// créer une lite qui va stocker le nom de plusieurs jouets (1.1)

		/*
		 * List<String> jouets = new ArrayList<>(); jouets.add("Scrabble Deluxe");
		 * jouets.add("Loup Garou"); jouets.add("Figurine"); jouets.add("Ozobot Evo");
		 * jouets.add("Peluche De Loutre"); jouets.add("Lego Star Wars");
		 * jouets.add("Pack Pokemon");
		 */ // Niveau 1; pour niveau deux, maintenant qu'il y a classe, mettre dans la liste
			// à la place de "String"

		// Afficher la liste (1.2)

		/*
		 * Méthode simple pour afficher la liste sur une ligne :
		 * System.out.println(jouets);
		 */

		// Méthode la plus courante (débutants) pour afficher la liste ligne par ligne :

		/*
		 * for (String jouet : jouets) { System.out.println(jouet);
		 * 
		 * 
		 * autre Méthode pour afficher ligne par ligne (avec forEach) :
		 * jouets.stream().forEach(jouet -> { System.out.println(jouet); });
		 */
		// Trier les jouets par ordre alphabetique (1.3)
		/*
		 * Collections.sort(jouets);
		 * 
		 * // (séparation pour lisibilité :
		 * 
		 * System.out.println("----------------------------------------> TRIE EN COURS"
		 * );
		 * 
		 * // Afficher à nouveau la liste : for (String jouet : jouets) {
		 * System.out.println(jouet);
		 */

		// Niveau 2

		List<Toy> jouets = new ArrayList<>();
		jouets.add(new Toy("Scrabble Deluxe", 20, "Petit jeu de société", 5)); // Toy(nom, prix, description, promo)
		jouets.add(new Toy("Loup Garou", 15, "Jeu de role", 10));
		jouets.add(new Toy("Figurine", 6, "Figurine de super hero", 5));
		jouets.add(new Toy("Ozobot Evo", 70, "Robot pour apprendre à dev", 15));
		jouets.add(new Toy("Peluche De Loutre", 30, "Peluche toute douce", 5));
		jouets.add(new Toy("Lego Star Wars", 120, "Lego box de Star Wars", 20));
		jouets.add(new Toy("Pack Pokemon", 20, "Jeu de carte Pokemon", 0));

		// N2

		for (Toy jouet : jouets) {
			System.out.println("Jouet : " + jouet.getNom() + " (" + jouet.getPrix() + "€) " + jouet.getDesc()
					+ " (promo : " + jouet.getPromo() + "% de reduc)");
		}

		System.out.println("--------------------> TRI");

		// 2.2 Tri par prix :
		Collections.sort(jouets, new Comparator<Toy>() {

			@Override
			public int compare(Toy jouet1, Toy jouet2) {
				return jouet1.getPrix() - jouet2.getPrix();

			}
		});
		/*
		 * Autre méthode plus longue : public int compare(Toy jouet1, Toy jouet2) { //
		 * if (jouet1.getPrix() > jouet2.getPrix()){ return 1; } else { return 0; }
		 */

		for (Toy jouet : jouets) {
			System.out.println("Jouet : " + jouet.getNom() + " (" + jouet.getPrix() + "€) " + jouet.getDesc()
					+ " (promo : " + jouet.getPromo() + "% de reduc)");

		}

	}
}
