package ru.job4j.chap2;

/**
 * Created by User on 09.04.2018.
 */
public class StubInput implements Input {

    private String[] value;
    private int position = 0;
    public StubInput() {

    }
    public StubInput(String[] value) {
        this.value = value;
    }

    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }


}
