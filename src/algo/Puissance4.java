package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Puissance4 {

	public static void main(String[] args) {

		ArrayList<Integer>[] plateau = new ArrayList[7];
		for (int i = 0; i < 7; i++) {
			plateau[i] = new ArrayList<Integer>();
		}

		// Variable pour savoir si un joueur a gagner (0 = non, 1= joueur 1, 2=
		int vainqueur = 0;

		int nbTour = 0;
		int tourDuJoueur = 1;
		while (vainqueur == 0 && nbTour < 42) {
			nbTour += 1;
			
			afficherPlateau(plateau);
			plateau = faireJouerJoueur(tourDuJoueur, plateau);

			if (aGagne(plateau)) {
				vainqueur = tourDuJoueur;
			}

			if (tourDuJoueur == 1) {
				tourDuJoueur = 2;
			} else {
				tourDuJoueur = 1;
			}
		}

		if (vainqueur > 0) {
			System.out.println("Le vainqueur est " + vainqueur);
		} else {
			System.out.println("Pas de vainqueur !");
		}
	}

	public static ArrayList<Integer>[] faireJouerJoueur(int i, ArrayList<Integer>[] plateau) {
		Scanner sc = new Scanner(System.in);
		System.out.println("J" + i + " : Colonne ?");
		int colonne = sc.nextInt();

		// Est-ce que la case est vide ?
		if(plateau[colonne-1].size() < 6) {
			plateau[colonne-1].add(i);
		} else {
			System.out.println("La case est deja prise !");
			plateau = faireJouerJoueur(i, plateau);
		}
		return plateau;
	}

	public static boolean aGagne(ArrayList<Integer>[] plateau) {
		Boolean aGagne = false;
		
		// Verif colonne
		for (int i = 0; i < 7; i++) {
			if(plateau[0].	size() >= 4) {
				// construction de la colonne
				int[] col = new int[plateau[0].size()];
				for(int j=0; j < plateau[0].size(); j++) {
					col[j] = plateau[0].get(j);
				}
				if(aQuatrePiontsDeSuite(col)) {
					aGagne = true;
				}
			}
		}
		
		// Verif ligne
		for (int i = 0; i < 8; i++) {
			int[] ligne = new int[7];
			
			// Construction de la ligne
			for(int j=0; j < 7; j++) {
				if(plateau[j].size() > i) {
					ligne[j] = plateau[j].get(i);
				}
				else {
					ligne[j] = 0;
				}
			}
			
			if(aQuatrePiontsDeSuite(ligne)) {
				aGagne = true;
			}
		}
		
		return aGagne;
	}
	
	public static boolean aQuatrePiontsDeSuite(int[] tableau) {
		Boolean result = false;
		int i =0;
		while( result == false && i < (tableau.length-4)) {
			if(tableau[i] != 0 ) {
				if(
						tableau[i]==tableau[i+1] && 
						tableau[i+1]==tableau[i+2] &&
						tableau[i+2]==tableau[i+3] 
				) {
					result=true;
				}
			}
			i +=1;
		}
		return result;
	}

	public static void afficherPlateau(ArrayList<Integer>[] plateau) {
		for (int i = 5; i >=0 ; i--) {
			for (int j = 0; j < 7 ; j++) {
				if( plateau[j].size() > i) {
					System.out.print(plateau[j].get(i) + "\t");
				}
				else {
					System.out.print(0 + "\t");
				}
			}
			System.out.println("");
		}
		System.out.println();
	}

}
