import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableauExo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1 : definir la liste par l'utilisateur
		// ****************************************************
		// initialisation de la liste
		List<String> maList = new ArrayList<>();
		// renseigner les valeurs
		String word;
		do {
			System.out.println("Entrez le mot :");
			word = sc.next();
			maList.add(word);
		} while (!word.equals("exit"));

		// Step 2 : demander un mot a l'utilisateur
		// ****************************************************
		System.out.println("Saisir le mot a chercher : ");
		String wordToSearch = sc.next();

		// Step 3 : trouver l'index dans la liste
		// ****************************************************
		if(maList.contains(wordToSearch)) {
			int index = maList.indexOf(wordToSearch);
			System.out.println("L'index du mot " + maList.get(index) + "  est " + index);
		}
		else {
			System.out.println("Le mot ne fait pas parti de la liste");
		}
		
	}

}