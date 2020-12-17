package com.dayetfracso.codep25.repository;

import java.util.List;

public class Course {

	private int horaire;
	private int idCourse;
	public List<Equipe> equipe;

	public Course(){

	}

	public int getHoraire() {
		return horaire;
	}

	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}
}