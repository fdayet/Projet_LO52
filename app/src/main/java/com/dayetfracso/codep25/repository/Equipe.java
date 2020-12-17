package com.dayetfracso.codep25.repository;

import java.util.List;

public class Equipe {

	private int idEquipe;
	private char nom;
	public List<Coureur> coureurs;

	public Equipe(){

	}

	public int getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}

	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}

	public List<Coureur> getCoureurs() {
		return coureurs;
	}

	public void setCoureurs(List<Coureur> coureurs) {
		this.coureurs = coureurs;
	}
}