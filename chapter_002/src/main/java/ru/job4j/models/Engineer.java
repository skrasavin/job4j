package ru.job4j.models;

public class Engineer extends Profession {

    Profession engineer = new Engineer();
    Home home = new Home();
    BuildingSite building = engineer.build(home);
}