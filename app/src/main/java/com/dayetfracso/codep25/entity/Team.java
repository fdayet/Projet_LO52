package com.dayetfracso.codep25.entity;

import android.content.Context;

import androidx.room.PrimaryKey;

import com.dayetfracso.codep25.dao.AppDatabase;

import java.util.List;

public class Team {
	@PrimaryKey(autoGenerate = true)
	private int idEquipe;
	private char nom;
	public List<Runner> runners;

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

	public List<Runner> getRunners() {
		return runners;
	}

	public void setRunners(List<Runner> runners) {
		this.runners = runners;
	}

	public boolean createTeams(Context context)
	{
		AppDatabase db = AppDatabase.getDatabase(context);
		List<Runner> runners = db.coureurDao().getAllRunners();

		if(runners.size() % 3 == 0)
		{
			// Calculating the mean of the runners levels
//			int mean = 0;
//			for(Coureur runner : runners)
//			{
//				mean += runner.getNiveau();
//			}
//
//			mean /= runners.size();


		}

		return false;
	}
}