package ru.job4j.loop;
/**
*class Counter.
*@autor - skrasavin.
*@since - 25.03.2018.
*/
class Counter {
	/**
	*метод add для подсчета суммы чисел в диапазоне.
	*@param - start, finish;
	*@return - сумма.
	*/
	public int add(int start, int finish) {
		int summ = 0;
		for ( ; start <= finish; start++) {
			if (start % 2 == 0) {
				summ += start;
			}
		}
		return summ;
	}
}