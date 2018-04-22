package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by User on 22.04.2018.
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("++++" + "\n")
                                .append("+  +" + "\n")
                                .append("+  +" + "\n")
                                .append("++++" + "\n")
                                .toString()
                )
        );
    }
}
