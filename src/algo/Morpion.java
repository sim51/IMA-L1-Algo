package algo;

import java.util.Scanner;

public class Morpion {

	public static void main(String[] args) {

		// Initialisation du plateau de jeu
		int[][] plateau = new int[3][3];
		plateau[0] = new int[] { 0, 0, 0 };
		plateau[1] = new int[] { 0, 0, 0 };
		plateau[2] = new int[] { 0, 0, 0 };
		
		// Variable pour savoir si un joueur a gagner (0 = non, 1= joueur 1, 2=
		int vainqueur = 0;
		
		int tourDuJoueur = 1;
		while(vainqueur == 0 && nbCaseVide(plateau) > 0 ) {
			afficherPlateau(plateau);
			plateau = faireJouerJoueur(tourDuJoueur, plateau);
			
			if(aGagne(tourDuJoueur, plateau)) {
				vainqueur = tourDuJoueur;
			}
			
			if(tourDuJoueur == 1) {
				tourDuJoueur = 2;
			}
			else {
				tourDuJoueur = 1;
			}
		}
		
		if(vainqueur > 0) {
			System.out.println("Le vainqueur est " + vainqueur);
		}
		else {
			System.out.println("Pas de vainqueur !");
		}
	}
	
	public static int[][] faireJouerJoueur(int i, int[][] plateau) {
		Scanner sc = new Scanner(System.in);
		System.out.println("J" + i + " : Ligne ?");
		int ligne = sc.nextInt();
		System.out.println("J" + i + " : Colonne ?");
		int colonne = sc.nextInt();
		
		// Est-ce que la case est vide ?
		if(plateau[ligne -1][colonne-1] == 0) {
			plateau[ligne-1][colonne-1] = i;
		}
		else {
			System.out.println("La case est deja prise !");
			plateau = faireJouerJoueur(i, plateau);
		}
		return plateau;
	}
	
	public static int nbCaseVide(int[][] plateau) {
		int nbCaseVide = 0;
		
		for(int i=0; i < plateau.length; i++) {
			for(int j=0; j < plateau[i].length; j++) {
				if(plateau[i][j] == 0) {
					nbCaseVide = nbCaseVide + 1;
				}
			}
		}
		return nbCaseVide;
	}
	
	public static boolean aGagne(int joueur, int[][] plateau) {
		boolean resultat = false;
		
		// verifier lignes
		for(int i = 0; i < 3; i++) {
			if (plateau[i][0] == joueur && plateau[i][1] == joueur  && plateau[i][2] == joueur) {
				resultat = true;
			}
		}
		
		// verifier colonnes
		for(int i = 0; i < 3; i++) {
			if (plateau[0][i] == joueur && plateau[1][i] == joueur  && plateau[2][i] == joueur) {
				resultat = true;
			}
		}
		
		// verifier diags
		if (plateau[0][0] == joueur && plateau[1][1] == joueur  && plateau[2][2] == joueur) {
			resultat = true;
		}
		
		if (plateau[0][2] == joueur && plateau[1][1] == joueur  && plateau[2][0] == joueur) {
			resultat = true;
		}
		return resultat;
	}
	
	public static void afficherPlateau(int[][] plateau) {
		for (int i = 0; i < plateau.length; i++ ) {
			System.out.println();
			for (int j = 0; j < plateau[i].length; j++ ) {
				System.out.print(plateau[i][j] + "\t");
			}
		}
		System.out.println();
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
}
