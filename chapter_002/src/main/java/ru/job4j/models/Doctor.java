package ru.job4j.models;

public class Doctor extends Profession {

    Profession doctor = new Doctor();
    Pacient pacient = new Pacient();
    Diagnose diagnose = doctor.heal(pacient);
	
}