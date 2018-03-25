package ru.job4j.loop;
/**
*класс для построение шахматной доски.
*@autor - skrasavin.
*@since - 25.08.2018.
*/
public class Board {
	/**
	*рисование доски.
	*@param - width, height.
	*@return - резудьтат рисования.
	*/
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int a = 0; a < height; a++) {
            for (int b = 0; b < width; b++) {

                if ((a + b) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}