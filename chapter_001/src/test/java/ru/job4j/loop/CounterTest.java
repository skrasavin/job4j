package ru.job4j.loop;

	import org.junit.Test;
	import static org.hamcrest.core.Is.is;
	import static org.junit.Assert.assertThat;
	
public class CounterTest {

	@Test
	public void whenSummNumbersFromStartToFinish() {
		Counter count = new Counter();
		int summ = count.add(0, 10);
		assertThat(30, is(summ));
	}
	
	
	
	
}