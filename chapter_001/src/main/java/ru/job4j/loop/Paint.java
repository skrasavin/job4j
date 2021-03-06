package ru.job4j.loop;
/*
*класс для построения пирамиды.
*@autor - skrasavin.
*@since - 25.08.2018.
*/
public class Paint {
	/**
	*метод построения пирамиды.
	*@param - height.
	*@return - пирамида.
	*/
	public String piramid(int height) {
    StringBuilder screen = new StringBuilder();
    int weight = 2 * height - 1;
    for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
            if (row >= height - column - 1 && row + height - 1 >= column) {
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