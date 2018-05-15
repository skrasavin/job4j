package ru.job4j.chap2;

/**
 * Created by User on 09.04.2018.
 */
public interface Input {
    String ask(String question);
    int ask(String question, int[] range);
}
