package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by User on 22.04.2018.
 */
public class PaintTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++" + "\n")
                                .append("+  +" + "\n")
                                .append("+  +" + "\n")
                                .append("++++" + "\n")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        this.backOutput();
    }
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("  +  " + "\n")
                                .append(" + + " + "\n")
                                .append("+   +" + "\n")
                                .append("+++++" + "\n")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}