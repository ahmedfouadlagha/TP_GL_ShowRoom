package tp3;
import java.util.ArrayList;
public class ShowRoom {
	private ArrayList < Vehicule > listeVehicule;
	// constructeur
	public ShowRoom(){
		listeVehicule = new ArrayList<Vehicule>();
	}
	//Trouver un identifiant libre 
	public int nouveauId() {
		if(listeVehicule.size() == 0)
			return 0;
		else
		{
			int Max_id = listeVehicule.get(0).getId();
			for(int i = 0; i < listeVehicule.size() ; i++) {
				if (Max_id < listeVehicule.get(i).getId()) 
					Max_id = listeVehicule.get(i).getId();
			}
			return Max_id + 1;
		}
	}
	//Ajouter un vehicule au showroom
	public void ajoutervoiture(Vehicule v) {
		listeVehicule.add(v);
	}
	//Afficher les vehicule d’un showroom
	public String affichershowroom () {
		String str = "showroom contient : " + listeVehicule.size() + " vehicules";
		for(int i = 0; i < listeVehicule.size(); i++)
			str = str + "\n" + listeVehicule.get(i).toString() ;
		return str;
	}
	
}