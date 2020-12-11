package com.GestionPharmacie.Models;

import java.util.ArrayList;

public class Pharmacien extends Persone {

	private int count;
	private int id;

	public Pharmacien() {
	}

	public Pharmacien(String Nom, String Prenom, String Telephone, String Email) {

		super(Nom, Prenom, Email, Telephone);

		count = 1;
		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// Ajouter pharmacien
	// composition
	public static void AjouterePharmacien(Pharmacien pharmacien, ArrayList<Pharmacien> pharmcn) {
		pharmcn.add(pharmacien);
		System.out.println("Ajouter Pharmacien avec succes  :" + pharmcn);
	}

	// Modifier pharmacien
	public void modifierPharmacien(ArrayList<Pharmacien> ListPharmacien, int id, String Nom, String prenom,
			String email, String telephone) {
		for (int j = 0; j < ListPharmacien.size(); j++) {
			if (id == ListPharmacien.get(j).getId()) {
				ListPharmacien.get(j).setId(id);
				ListPharmacien.get(j).setNom(Nom);
				ListPharmacien.get(j).setPrenom(prenom);
				ListPharmacien.get(j).setEmail(email);
				ListPharmacien.get(j).setTelephone(telephone);
				System.out.println(
						"Modifier avec succes id =" + id + " and Pharmaciens : \n" + ListPharmacien.get(j).toString());
			} else {
				System.out.println("sorry dont find");
			}
		}
	}

	// supprimer pharmacien
	public void supprimerPharmacien(ArrayList<Pharmacien> ListPharmacien, int id) {
		for (int j = 0; j < ListPharmacien.size(); j++) {
			if (id == ListPharmacien.get(j).getId()) {
				ListPharmacien.remove(j);
				System.out.println("supprimer Pharmacien avec succes  de id =" + id);
			} else {
				System.out.println("sorry dont find");
			}
		}
	}

	// cherche pharmacien
	public void cherchepharmacien(ArrayList<Pharmacien> ListPharmacien, int id) {
		int ifexist = 0;
		for (int j = 0; j < ListPharmacien.size(); j++) {
			if (id == ListPharmacien.get(j).getId()) {
				System.out.println("id : " + ListPharmacien.get(j).getId() + " \n Nom : "
						+ ListPharmacien.get(j).getNom() + "\n Prenom : " + ListPharmacien.get(j).getPrenom()
						+ " \n Email : " + ListPharmacien.get(j).getEmail() + " \n Tele : "
						+ ListPharmacien.get(j).getTelephone());
				ifexist = 1;
			}
		}
		if (ifexist == 0) {
			System.out.println("sorry dont find");
		}
	}

}
