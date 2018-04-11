package ru.job4j.models;

public class Teacher extends Profession {

    public Exam physics(Student student) {
        return new Exam();
    }
}