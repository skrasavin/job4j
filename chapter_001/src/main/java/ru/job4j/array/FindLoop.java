package ru.job4j.array;
/**
*вывести индекс по ячейке.
*@autor - skrasavin.
*@since - 26.03.2018.
*/
public class FindLoop {
	/**
	*@param - data, el;
	*@return - результат.
	*/
	public int indexOf(int[] data, int el) {
		int rst = -1;
		for (int index = 0; index != data.length; index++) {
			if (data[index] == el) {
                rst = index;
                break;
            }
		}
		return rst;
	}
}