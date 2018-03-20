package ru.job4j.calculator;
/**
*class Calculator для вычисления арифметических операций.
*@autor - skrasavin.
*@since - 20.03.2018.
*/
public class Calculator {
	/**
	*@param - result;
	*/
	double result;
	/**
	*method add для суммирования.
	*@arg - first, second.
	*/
	public void add(double first, double second) {
		this.result = first + second;	
	}
	/**
	*method subtract для вычитания.
	*@arg - first, second.
	*/
	public void subtract(double first, double second) {
		this.result = first - second;	
	}
	/**
	*method div для умножения.
	*@arg - first, second.
	*/
	public void div(double first, double second) {
		this.result = first / second;	
	}
	/**
	*method multiple для деления.
	*@arg - first, second.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;	
	}
	/**
	*method getResult для получения значения переменной.
	*@return - result;
	*/
	public double getResult() {
		return this.result;
	}
	
}