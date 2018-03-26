package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
	@Test
	public void testSquare123() {
		Square square = new Square();
		int[] rst = square.calculate(3);
        int[] expect = new int[] {1, 4, 9};
		assertThat(rst, is(expect));
	}
	@Test
	public void testSquare12345() {
		Square square = new Square();
		int[] rst = square.calculate(5);
        int[] expect = new int[] {1, 4, 9, 16, 25};
		assertThat(rst, is(expect));
	}
	@Test
	public void testSquare1234567() {
		Square square = new Square();
		int[] rst = square.calculate(7);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49};
		assertThat(rst, is(expect));
	}
}