package com.GestionPharmacie.Models;
import java.util.ArrayList;

public class Medicament {
	
	private static int count=1;
	private int id;
	
	private String nom,description,prix;
	//int prix;
	
	public Medicament() {}
	public Medicament(String Nom,String Description,String Prix) {
		this.nom=Nom;
		this.description=Description;
		this.prix=Prix;		
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString(  ) {
		return   "[" + this.id + "," + this.nom + "," + this.description + "," + this.prix + "]";
	}
	
	//Ajouter Medicament
	//composition
	public static void AjoutereMedicament(Medicament medicament, ArrayList<Medicament> mdcmnt ) {
		mdcmnt.add(medicament);
		System.out.println("Ajouter Pharmacien avec succes  :" + mdcmnt);
	}

	//Modifier Medicament
	public void modifierMedicament(ArrayList<Medicament> ListMedicament, int id, String Nom,String description,String prix) {
		for(int j=0;j<ListMedicament.size();j++) {
			if(id==ListMedicament.get(j).getId()) {
				ListMedicament.get(j).setId(id);
				ListMedicament.get(j).setNom(Nom);
				ListMedicament.get(j).setDescription(description);
				ListMedicament.get(j).setPrix(prix);
				System.out.println("Modifier avec succes id =" + id + " and Pharmaciens : \n" + ListMedicament.get(j).toString());
			}else {
				  System.out.println("sorry dont find");
			 }
		}
	}
	//supprimer Medicament
	public void supprimerMedicament(ArrayList<Medicament> ListMedicament ,int id) {
		for(int j=0;j<ListMedicament.size();j++) {
			  if(id==ListMedicament.get(j).getId()) {
				  ListMedicament.remove(j);
				  System.out.println("supprimer Medicament avec succes  de id =" + id); 
			  }else {
				  System.out.println("sorry dont find");
			  }
		  }
	}
	//cherche Medicament
	public void chercheMedicament(ArrayList<Medicament> ListMedicament, int id) {
		int ifexist = 0;
		for(int j=0;j<ListMedicament.size();j++) {
			if(id==ListMedicament.get(j).getId()) {
				System.out.println(" id : " + ListMedicament.get(j).getId() + " \n Nom : " + ListMedicament.get(j).getNom() + "\n description : " + ListMedicament.get(j).getDescription() + " \n Prix : "  + ListMedicament.get(j).getPrix() );
				ifexist = 1;
			}
		}if(ifexist == 0) {
			  System.out.println("sorry dont find");
		 }
	}
	
	public static int checkMedicamentIfExist(ArrayList<Medicament> ListMedicament, int id) {
		int a;
		a = 0;
		for(int j=0;j<ListMedicament.size();j++) {
			if(id==ListMedicament.get(j).getId()) {
				a = 1;
			}
		}
	    return a;
	 }
	
	
	
	

}
