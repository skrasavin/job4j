package ru.job4j.max;
/**
*class Max.
*@autor - skrasavin
*@since - 23.03.2018.
*/
public class Max {
		
	/**
	*метод max для проверки на большее число.
	*@param - first, second;
	*@return - return;
	*/
	 public int max(int first, int second) {
		return first > second ? first : second;
	 }
	 /**
	*метод max для проверки на большее число.
	*@param - first, second, third;
	*@return - return;
	*/
	 public int max(int first, int second, int third) {
		int temp1 = this.max(first, second);
		int temp = this.max(temp1, third);
		return temp;
	 }
}