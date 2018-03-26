package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
	@Test
	public void sortArrayWithBubbleSort() {
		BubbleSort test = new BubbleSort();
		int[] input = new int[] {5, 8, 3, 6, 1, 2, 4, 7, 9};
		input = test.sort(input);
		int[] output = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertThat(output, is(input));
	}
}