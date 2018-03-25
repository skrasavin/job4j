package ru.job4j.loop;

/**
*class Factorial.
*@autor - skrasavin;
*@since - 25.03.2018.
*/
public class Factorial {
	/**
	*метод для вычисления факториала.
	*@param - n.
	*@return - result;
	*/
	public int calc(int n) {
		int result = 1;
		for (int count = 1; count <= n; count++) {
			result *= count;
		} 
		return result;
	}
}