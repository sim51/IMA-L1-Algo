
public class Matrice {

	public static void main(String[] args) {

		// Définition de la matrice 1
		int[][] mat1 = new int[4][4];
		mat1[0] = new int[] { 1, 2, 3, 4 };
		mat1[1] = new int[] { 1, 2, 3, 4 };
		mat1[2] = new int[] { 1, 2, 3, 4 };
		mat1[3] = new int[] { 1, 2, 3, 4 };

		// Définition de la matrice 2
		int[][] mat2 = new int[4][4];
		mat2[0] = new int[] { 1, 2, 3, 4 };
		mat2[1] = new int[] { 1, 2, 3, 4 };
		mat2[2] = new int[] { 1, 2, 3, 4 };
		mat2[3] = new int[] { 1, 2, 3, 4 };

		// Déclaration du résultat
		int[][] resultat = new int[4][4];

		// Produit de matrices
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				int value = 0;
				
				// calcul du résultat pour la case (i,j)
				for(int k =0; k < mat1.length; k++) {
					value += mat1[i][k] * mat2[k][j]; 
				}
				
				resultat[i][j] = value;
			}
		}

	}

}
