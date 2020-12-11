package com.GestionPharmacie.Models;

import java.util.ArrayList;

public class Client extends Persone {

	private int count;
	private int id;
	private int nombrAchat;
	private int badge;

	public Client() {
	}

	public Client(String Nom, String Prenom, String Email, String Telephone, int Badge) {
		super(Nom, Prenom, Email, Telephone);
		// TODO Auto-generated constructor stub

		count = 1;
		this.id = count++;
		this.badge = Badge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		// return "[" + this.id + "," + super.toString() + "," + this.badge + "]";
		return super.toString() + "," + this.badge + "]";
	}

	// Ajouter Client
	// composition
	public static void AjoutereClient(Client client, ArrayList<Client> Clnt) {
		Clnt.add(client);
		System.out.println("Ajouter Client avec succes  :" + Clnt);
	}

	// Modifier Client
	public void modifierClient(ArrayList<Client> ListClient, String Nom, String prenom, String email, String telephone,
			int badge, Client client) {

		int numbadge = 0;

		int a;
		int bdg = 0;
		int bdg2 = 0;
		a = 0;
		for (int j = 0; j < ListClient.size(); j++) {
			if (Nom == ListClient.get(j).getNom()) {
				bdg = ListClient.get(j).getBadge();
				// bdg = bdg + 1;
				bdg++;
				ListClient.get(j).setBadge(bdg);
				// a = 1;
			}
		}

		if (bdg == 0) {
			System.out.println("1 Welcom votre nombre dachat = " + bdg + "\n");
			ListClient.add(client);
			System.out.println("\n achat effectuer avec suces");
		} else if (bdg > 0 && bdg < 3) {
			System.out.println("2 Welcom votre nombre dachat = " + bdg + "\n");
		} else {
			System.out.println("2 Welcom you are client fidel votre nombre dachat = " + bdg + "\n");
		}
	}

	// Modifier Client
	public void modifierClient(ArrayList<Client> ListClient, int id, String Nom, String prenom, String email,
			String telephone, int nombrAchat, String badge) {
		for (int j = 0; j < ListClient.size(); j++) {
			if (id == ListClient.get(j).getId()) {
				ListClient.get(j).setId(id);
				ListClient.get(j).setNom(Nom);
				ListClient.get(j).setPrenom(prenom);
				ListClient.get(j).setEmail(email);
				ListClient.get(j).setTelephone(telephone);
				// ListClient.get(j).setNombrAchat(nombrAchat);
				// ListClient.get(j).setBadge(badge);
				System.out
						.println("Modifier avec succes id =" + id + " and Clients : \n" + ListClient.get(j).toString());
			} else {
				System.out.println("sorry dont find");
			}
		}
	}

	// supprimer Client
	public void supprimerClient(ArrayList<Client> ListClient, int id) {
		for (int j = 0; j < ListClient.size(); j++) {
			if (id == ListClient.get(j).getId()) {
				ListClient.remove(j);
				System.out.println("supprimer Client avec succes  de id =" + id);
			} else {
				System.out.println("sorry dont find");
			}
		}
	}

	static int checkClientIfExist(ArrayList<Client> ListClient, String Nom) {
		int a;
		int bdg = 0;
		int bdg2 = 0;
		a = 0;
		for (int j = 0; j < ListClient.size(); j++) {
			if (Nom == ListClient.get(j).getNom()) {
				bdg = ListClient.get(j).getBadge();
				bdg = bdg + 1;
				ListClient.get(j).setBadge(bdg);
			}
		}
		return bdg;
	}

}
