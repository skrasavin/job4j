package ru.job4j.loop;
/*
*класс для построения пирамиды.
*@autor - skrasavin.
*@since - 26.08.2018.
*/
import java.util.function.BiPredicate;

public class PaintOne {
	/**
	*метод построения пирамиды.
	*@param - height.
	*@return - пирамида.
	*/
	public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
	/**
	*метод для рефакторинга.
	*@param - height, weight, predict.
	*@return - return.
	*/
	private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}