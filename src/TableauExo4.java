import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TableauExo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1 : definir la liste par l'utilisateur
		// ****************************************************
		// initialisation de la liste
		List<String> wordList = new ArrayList<>();
		// renseigner les valeurs
		String word;
		do {
			System.out.println("Entrez le mot :");
			word = sc.next();
			wordList.add(word);
		} while (!word.equals("exit"));

		Map<String, Integer> countByWord = new HashMap<>();

		// Step 2 : trouver le nombre d'occurence pour chaque mot
		// ****************************************************
		for (int i = 0; i < wordList.size(); i++) {
			String currentWord = wordList.get(i);

			int count = 1;
			if (countByWord.containsKey(currentWord)) {
				count = countByWord.get(currentWord) + 1;
			}

			countByWord.put(currentWord, count);
		}

		// Step 3 : Afficher le resultat
		// ****************************************************
		for (String key : countByWord.keySet()) {
			System.out.println(key + " -> " + countByWord.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}