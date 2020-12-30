package com.dayetfracso.codep25.entity;

public class RunnerStats {

	private int statsId;
	private int runnerId;
	private int raceId;
	private int obstacle1;
	private int obstacle2;
	private int pitstop;
	private int sprint1;
	private int sprint2;
	public Race race;
	public Runner runner;

	public RunnerStats(){

	}

	public int getRunnerId() {
		return runnerId;
	}

	public void setRunnerId(int runnerId) {
		this.runnerId = runnerId;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getStatsId() {
		return statsId;
	}

	public void setStatsId(int statsId) {
		this.statsId = statsId;
	}

	public int getObstacle1() {
		return obstacle1;
	}

	public void setObstacle1(int obstacle1) {
		this.obstacle1 = obstacle1;
	}

	public int getObstacle2() {
		return obstacle2;
	}

	public void setObstacle2(int obstacle2) {
		this.obstacle2 = obstacle2;
	}

	public int getPitstop() {
		return pitstop;
	}

	public void setPitstop(int pitstop) {
		this.pitstop = pitstop;
	}

	public int getSprint1() {
		return sprint1;
	}

	public void setSprint1(int sprint1) {
		this.sprint1 = sprint1;
	}

	public int getSprint2() {
		return sprint2;
	}

	public void setSprint2(int sprint2) {
		this.sprint2 = sprint2;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}
}

