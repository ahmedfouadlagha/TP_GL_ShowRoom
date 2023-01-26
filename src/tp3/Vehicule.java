package tp3;

public class Vehicule {
	private final int id;
	private String marque;
	private String couleur;
	private int annee;
	private String moteur;
	// constructeur
	public Vehicule( ShowRoom L,String marque, String couleur, int annee, String moteur) {
		super();
		this.id = L.nouveauId();
		this.marque = marque;
		this.couleur = couleur;
		this.annee = annee;
		this.moteur = moteur;
	}
	//les méthodes getters and setters
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getMoteur() {
		return moteur;
	}
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Vehicule [id=" + id + ", marque=" + marque + ", couleur=" + couleur + ", annee=" + annee + ", moteur="
				+ moteur + "]";
	}
		
}
