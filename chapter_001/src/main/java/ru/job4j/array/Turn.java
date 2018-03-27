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
		int count = 0;
		int help = 0;
		for (int num = array.length - 1; num >= 0; num--) {
			if (array[num] == array[count]) {
				break;
			}
			help = array[num];
			array[num] = array[count];
			array[count] = help;
			count++;
		}
		return array;
	}
}