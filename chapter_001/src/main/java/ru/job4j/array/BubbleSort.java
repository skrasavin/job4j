package ru.job4j.array;
/**
*класс для сортировка массива пузырьковым методом.
*@autor - skrasavin.
*@since - 26.03.2018.
*/
public class BubbleSort {
	/**
	*@param - array.
	*@return - result - arr[].
	*/
	public int[] sort(int[] array) {
		for (int x = 0; x != array.length; x++) {
			for (int index = 0; index != array.length - 1; index++) {
				int help = 0;
				if (array[index] > array[index + 1]) {
					help = array[index];
					array[index] = array[index + 1];
					array[index + 1] = help;
				}
			}
		}
		return array;
	}
}