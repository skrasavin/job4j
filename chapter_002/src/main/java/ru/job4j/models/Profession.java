package ru.job4j.models;

public class Profession {
	String name;
	String profession;
	
	public Diagnose heal(Pacient pacient) {
		Diagnose diagnose = new Diagnose();
		return diagnose;
	}
	public int build(Home home) {
		return home.buildTime;
	}
	public String teach(Student student) {
		return student.name;
	}
	public String getName() {
		return name;
	}
}