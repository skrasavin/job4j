package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
	@Test
	public void whenGetIndexIntoArray() {
	FindLoop fl = new FindLoop();
	int[] input = new int[] {5, 10, 3};
	int expect = fl.indexOf(input, 3);
	assertThat(2, is(expect));
	}
	@Test
	public void whenGetIndexIntoArray4() {
	FindLoop fl = new FindLoop();
	int[] input = new int[] {5, 10, 3, 7, 15};
	int expect = fl.indexOf(input, 8);
	assertThat(-1, is(expect));
	}
}