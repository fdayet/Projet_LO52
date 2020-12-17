package com.dayetfracso.codep25.repository;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "coureurs")
public class Coureur {
	@PrimaryKey(autoGenerate = true)
	private int idCoureur;
	private int niveau;
	@ColumnInfo(name="nom_complet")
	private String nomComplet;

	public Coureur(){

	}

	public int getIdCoureur() {
		return idCoureur;
	}

	public void setIdCoureur(int idCoureur) {
		this.idCoureur = idCoureur;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
}