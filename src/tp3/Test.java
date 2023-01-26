package tp3;
public class Test {
	public static void main(String[] args) {
		//créer un objet de la classe Showroom
		ShowRoom L = new ShowRoom();
		//ajouter des vehicule dans cet objet L
		L.ajoutervoiture(new Vehicule(L,"renault","rouge",2012,"essence"));
		L.ajoutervoiture(new Vehicule(L,"peugeot","blue",2019,"diesel"));
		L.ajoutervoiture(new Vehicule(L,"hyundai","noir",2022,"essence"));
		//afficher la liste des vehicules
		System.out.println(L.affichershowroom());
	}

}
