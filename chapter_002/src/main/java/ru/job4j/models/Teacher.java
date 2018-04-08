package ru.job4j.models;

public class Teacher extends Profession {
	Profession teacher = new Teacher();
    Student student = new Student();
    Exam exam = teacher.teach(student);
}