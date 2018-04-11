package ru.job4j.models;

public class Doctor extends Profession {

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
	
}