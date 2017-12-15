
public class Hobbit {
	
	public String nom;
	public String prenom;
	public int annee;
	public String adresse;

	public Hobbit(String nom2, String prenom2, int annee2, String adresse2) {
		nom = nom2;
		prenom = prenom2;
		adresse = adresse2;
		annee = annee2;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom2) {
		nom = nom2;
	}
}
