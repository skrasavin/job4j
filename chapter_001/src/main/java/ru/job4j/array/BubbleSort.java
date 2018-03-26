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
		int[] arr = array;
		int help = 0;
		for (int x = 0; x != arr.length; x++) {
			for (int index = 0; index != arr.length; index++) {
				if (index + 1 >= arr.length) {
					break;
				}
				if (arr[index] > arr[index + 1]) {
					help = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = help;
				}
			}
		}
		return arr;
	}
}