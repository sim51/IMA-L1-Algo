public class Etudiant {

	// question 1
	public String nom;
	public String prenom;
	public int age;

	// question 2
	public Etudiant(String nom2, String prenom2, int age2) {
		nom = nom2;
		prenom = prenom2;
		age = age2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
