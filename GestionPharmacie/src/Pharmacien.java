
import java.util.ArrayList;

//import brif2Bibliothéque.etudiant;

//import brif2Bibliothéque.etudiant;

public class Pharmacien {
	
	private static int count=1;
	private int id;
	
	private String nom,prenom,telephone,email;
	
	public Pharmacien() {}
	public Pharmacien(String Nom,String Prenom,String Telephone,String Email) {
		this.nom=Nom;
		this.prenom=Prenom;
		this.telephone=Telephone;
		this.email=Email;
		
		
		this.id=count++;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/*
	@Override
	
	public String toString(  ) {
		return   "[" + this.id + "," + this.nom + "," + this.prenom + "," + this.email + "," + this.telephone + "]";
	}
	*/
	@Override
	public String toString(  ) {
		return   "["+ this.id + "," +this.nom + "," + this.prenom + "," + this.email + "," + this.telephone +"]";
	}
	
	//Ajouter pharmacien
	//composition
	public static void AjouterePharmacien(Pharmacien pharmacien, ArrayList<Pharmacien> pharmcn ) {
		pharmcn.add(pharmacien);
		System.out.println("Ajouter Pharmacien avec succes  :" + pharmcn);
	}
	
	//Modifier pharmacien
	public void modifierPharmacien(ArrayList<Pharmacien> ListPharmacien, int id, String Nom,String prenom,String email,String telephone) {
		for(int j=0;j<ListPharmacien.size();j++) {
			if(id==ListPharmacien.get(j).getId()) {
				ListPharmacien.get(j).setId(id);
				ListPharmacien.get(j).setNom(Nom);
				ListPharmacien.get(j).setPrenom(prenom);
				ListPharmacien.get(j).setEmail(email);
				ListPharmacien.get(j).setTelephone(telephone);
				System.out.println("Modifier avec succes id =" + id + " and Pharmaciens : \n" + ListPharmacien.get(j).toString());
			}else {
				  System.out.println("sorry dont find");
			 }
		}
	}
	
	//supprimer pharmacien
	public void supprimerPharmacien(ArrayList<Pharmacien> ListPharmacien ,int id) {
		for(int j=0;j<ListPharmacien.size();j++) {
			  if(id==ListPharmacien.get(j).getId()) {
				  ListPharmacien.remove(j);
				  System.out.println("supprimer Pharmacien avec succes  de id =" + id); 
			  }else {
				  System.out.println("sorry dont find");
			  }
		  }
	}
	
	//cherche pharmacien
		public void cherchepharmacien(ArrayList<Pharmacien> ListPharmacien, int id) {
			int ifexist = 0;
			for(int j=0;j<ListPharmacien.size();j++) {
				if(id==ListPharmacien.get(j).getId()) {
					System.out.println("id : " + ListPharmacien.get(j).getId() + " \n Nom : " + ListPharmacien.get(j).getNom() + "\n Prenom : " + ListPharmacien.get(j).getPrenom() + " \n Email : "  + ListPharmacien.get(j).getEmail() + " \n Tele : "  + ListPharmacien.get(j).getTelephone() );
					ifexist = 1;
				}
			}if(ifexist == 0) {
				  System.out.println("sorry dont find");
			 }
		}
	
	
}
