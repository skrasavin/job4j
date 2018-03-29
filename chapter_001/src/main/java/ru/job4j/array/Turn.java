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

		for (int i = 0; i < array.length / 2; i++) {
			int help = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = help;
		}
		return array;
	}
}