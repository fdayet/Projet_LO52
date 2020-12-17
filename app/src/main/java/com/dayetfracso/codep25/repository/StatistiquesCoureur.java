package com.dayetfracso.codep25.repository;

public class StatistiquesCoureur {

	private int idCoureur;
	private int idCourse;
	private int idStatistique;
	private int obstacle1;
	private int obstacle2;
	private int pitstop;
	private int sprint1;
	private int sprint2;
	public Course course;
	public Coureur coureur;

	public StatistiquesCoureur(){

	}

	public int getIdCoureur() {
		return idCoureur;
	}

	public void setIdCoureur(int idCoureur) {
		this.idCoureur = idCoureur;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public int getIdStatistique() {
		return idStatistique;
	}

	public void setIdStatistique(int idStatistique) {
		this.idStatistique = idStatistique;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Coureur getCoureur() {
		return coureur;
	}

	public void setCoureur(Coureur coureur) {
		this.coureur = coureur;
	}
}

