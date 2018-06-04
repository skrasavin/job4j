package ru.job4j.coffee;
import java.util.Arrays;

public class CoffeeMaker {

	final int tenRubles = 10;
	final int fiveRubles = 5;
	final int twoRubles = 2;
	final int oneRubles = 1;

	private int[] changes(int value, int price) {
		
		int amount = value - price;
		int[] container = new int[20];
		int counter = 0;

		for (int a = 0; amount != 0; a++) {
			if (amount >= tenRubles) {
				amount -= tenRubles;
				container[counter++] = tenRubles;
			} else if (amount >= fiveRubles) {
				amount -= fiveRubles;
				container[counter++] = fiveRubles;
			} else if (amount >= twoRubles) {
				amount -= twoRubles;
				container[counter++] = twoRubles;
			} else if (amount >= oneRubles) {
				amount -= oneRubles;
				container[counter++] = oneRubles;
			}
		}
		int[] contain = Arrays.copyOf(container, counter);
		return contain;
	}
		public static void main(String[] args) {
		CoffeeMaker cm = new CoffeeMaker();
		int[] result = cm.changes(50, 15);
		for (int res : result) {
			System.out.println(res);

		}
	}
}