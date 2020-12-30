package com.dayetfracso.codep25.entity;

import androidx.room.PrimaryKey;

import java.util.List;

public class Race {
	@PrimaryKey(autoGenerate = true)
	private int raceId;
	private int timing;
	public List<Team> team;

	public int getTiming() {
		return timing;
	}

	public void setTiming(int timing) {
		this.timing = timing;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}
}