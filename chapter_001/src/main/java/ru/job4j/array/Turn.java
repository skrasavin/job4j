package ru.job4j.array;
/**
*перевернуть массив.
*@autor - skrasavin.
*@since - 26.03.2018.
*/
public class Turn {
	/**
	*@param - array;
	*@return - arr;
	*/
	public int[] back(int[] array) {
		int[] arr = new int[array.length];
		int count = 0;
		for (int num = arr.length - 1; num >= 0; num--) {
			arr[count] = array[num];
			count++;
		}
		return arr;
	}
}