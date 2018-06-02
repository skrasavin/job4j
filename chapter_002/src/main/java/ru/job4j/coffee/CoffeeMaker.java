package ru.job4j.coffee;

public class CoffeeMaker{

	final int tenRubles = 10;
	final int fiveRubles = 5;
	final int twoRubles = 2;
	final int oneRubles = 1;

	private int[] changes(int value, int price) {
		
		int amount = value - price;
		int[] container = new int[3];
		int counter = 0;
		boolean stop = true;
		
		while(stop) {
			if(amount >= tenRubles) {
				amount = amount - tenRubles;
				container[counter++] = tenRubles;
			}if (amount >= fiveRubles) {
				amount = amount - fiveRubles;
				container[counter++] = fiveRubles;
			}if (amount >= twoRubles) {
				amount = amount - twoRubles;
				container[counter++] = twoRubles;
			}if (amount >= oneRubles) {
				amount = amount - oneRubles;
				container[counter++] = oneRubles;
			}
		}
		return container;
	}
		public static void main(String[] args) {
		CoffeeMaker cm = new CoffeeMaker();
		int[] result = cm.changes(50, 35);
		for(int res : result) {
			System.out.println(res);




		}
	}
}
	
