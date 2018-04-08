package ru.job4j.models;

public class Profession {
	String name;
	String profession;

	public Diagnose heal(Pacient pacient) {
		return new Diagnose();
	}
	public BuildingSite build(Home home) {
		return new BuildingSite();
	}
	public Exam teach(Student student) {
		return new Exam();
	}
	public String getName() {
		return name;
	}
}