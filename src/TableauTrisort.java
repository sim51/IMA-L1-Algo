import java.util.Scanner;

public class TableauTrisort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1 : definir le tableau par l'utilisateur
		// ****************************************************
		System.out.println("Donner la taille du tableau :");
		int taille = sc.nextInt();

		// initialisation du tableau
		int[] tableau = new int[taille];

		// renseigner les valeurs
		for (int i = 0; i < taille; i++) {
			System.out.println("Entrez la valeur :");
			int valeur = sc.nextInt();
			tableau[i] = valeur;
		}

		// Step 2 : construction du tableau trié
		// ****************************************************
		int[] resultat = new int[taille];

		int dernierMinimum = 0;
		for (int j = 0; j < taille; j++) {
			int min = trouverMinimumSuperieurA(tableau, dernierMinimum);
			resultat[j] = min;
			dernierMinimum = min;
		}

		// Step 3 : afficher le resultat
		// ****************************************************
		System.out.println("Le resultat est : ");
		System.out.println("");
		for (int l = 0; l < resultat.length; l++) {
			System.out.print(resultat[l] + " ");
		}

		sc.close();
	}

	/**
	 * Trouver le min d'un tableau superieur a une valeur.
	 * 
	 * @param tab
	 * @return
	 */
	public static int trouverMinimumSuperieurA(int[] tab, int dernierMinimum) {

		int min = trouverMaxTableau(tab);

		for (int k = 0; k < tab.length; k++) {
			if (tab[k] < min) {
				if (tab[k] > dernierMinimum) {
					min = tab[k];
				}
			}
		}

		return min;
	}

	public static int trouverMaxTableau(int[] tab) {
		int max = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

}