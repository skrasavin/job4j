package ru.job4j.models;

public class Engineer extends Profession {

    public CurrentResult build(Home home) {
        return new CurrentResult();
    }
}