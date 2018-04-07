package ru.job4j.chap2;

import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    public String ask() {
        return scanner.nextLine();
    }

}