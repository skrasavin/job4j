package ru.job4j.array;
/**
*заполнение двумерного массива.
*
*
*/
public class Matrix {
	int[][] multiple(int size) {
		int[][] arr = new int[size][size];
		for (int x = 0; x != size; x++) {
			for (int y = 0; y != size; y++) {
				arr[x][y] = y + 1;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		int[][] mult = matrix.multiple(9);
		for (int[] mul : mult) {
			for (int mul2 : mul) {
				System.out.print(mul2);
			}
			System.out.println();
		}


	}
}