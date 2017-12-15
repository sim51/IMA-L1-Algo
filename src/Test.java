
public class Test {

	public static void main(String[] args) {
		Etudiant moi = new Etudiant("Simard", "Benoit", 12);
		moi.getNom();
		
		Etudiant moi2 = new Etudiant("Simard", "Benoit", 12);
		moi2.getNom();
		
		String prenom = "Julien";
		moi.setPrenom(prenom);
	}

}
