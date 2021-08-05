package com.cricapp.model;

public class Cricketer {
	String name;
	int jerseryno;
	String role;
	int ranking;

	public Cricketer(String name, int jerseryno, String role, int ranking) {
		super();
		this.name = name;
		this.jerseryno = jerseryno;
		this.role = role;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public int getJerseryno() {
		return jerseryno;
	}

	public String getRole() {
		return role;
	}

	public int getRanking() {
		return ranking;
	}

	@Override
	public String toString() {
		return "Cricketer name=" + name + ", jerseryno=" + jerseryno + ", role=" + role + ", ranking=" + ranking;
	}

}
