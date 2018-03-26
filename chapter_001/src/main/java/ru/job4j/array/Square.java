package ru.job4j.array;
/**
*@class - Square.
*@autor - skrasavin.
*@since - 26.03.2018
*/
public class Square {
	/**
	*@param - bound. Класс для нахождения квадрата каждого числа
	*массива до предела - bound.
	*@return - result.
	*/
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		int count = 0;
		for (int num = 1; num != rst.length + 1; num++) {
			rst[count] = num * num;
			count++;
		}
		return rst;
	}
}