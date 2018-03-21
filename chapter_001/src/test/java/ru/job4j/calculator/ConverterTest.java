package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
		public void whenRubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(600);
        assertThat(result, is(10));
    }
    @Test
		public void whenRubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(700);
        assertThat(result, is(10));
    }
	    @Test
		public void whenDollarToRubleThen() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(10);
        assertThat(result, is(600));
    }
	    @Test
		public void whenEuroToRubleThen() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(10);
        assertThat(result, is(700));
    }
}