package com.GestionPharmacie.Models;

import java.util.ArrayList;

public class Persone {

	private int count;
	private int id;

	private String nom, prenom, telephone, email;

	public Persone() {
	}

	public Persone(String Nom, String Prenom, String Telephone, String Email) {
		this.nom = Nom;
		this.prenom = Prenom;
		this.telephone = Telephone;
		this.email = Email;

		count = 1;
		this.id = count++;
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

	@Override
	public String toString() {
		return "[" + this.id + "," + this.nom + "," + this.prenom + "," + this.email + "," + this.telephone + "]";
	}

}
