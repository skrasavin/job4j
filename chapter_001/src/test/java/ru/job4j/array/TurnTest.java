package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
	@Test
	public void arrayInvertEven() {
		Turn turn = new Turn();
		int[] input = new int[] {2, 4, 6, 8, 10};
		int[] outputTest = new int[] {10, 8, 6, 4, 2};		
		int[] result = turn.back(input);
		assertThat(result, is(outputTest));
	}
	@Test
	public void arrayInvertUneven() {
		Turn turn = new Turn();
		int[] input = new int[] {1, 3, 5, 7, 9};
		int[] outputTest = new int[] {9, 7, 5, 3, 1};		
		int[] result = turn.back(input);
		assertThat(result, is(outputTest));
	}
}