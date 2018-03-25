package ru.job4j.loop;

	import org.junit.Test;
	import static org.hamcrest.core.Is.is;
	import static org.junit.Assert.assertThat;
	
public class FactorialTest {

	@Test
	public void whenAllValuesMultiplication() {
		Factorial factor = new Factorial();
		int result = factor.calc(5);
		assertThat(120, is(result));
	}
	@Test
	public void whenAllValuesMultiplIsNull() {
		Factorial factor = new Factorial();
		int result = factor.calc(0);
		assertThat(1, is(result));
	}
}