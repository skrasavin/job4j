package ru.job4j.array;
/**
*заполнение двумерного массива.
*@autor - skrasavin.
*@since - 29.03.2018.
*/
public class Matrix {
	/**
	*построение матрицы в виде таблицы умножения.
	*@param - size.
	*return - arr.
	**/
	int[][] multiple(int size) {
		int[][] arr = new int[size][size];
		for (int x = 1; x <= size; x++) {
			for (int y = 1; y <= size; y++) {
				arr[x - 1][y - 1] = y * x;
			}
		}
		return arr;
	}
}