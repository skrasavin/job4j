package ru.job4j.array;
/**
 * class ArrayChar.
 * @author - skrasavin.
 * @since - 31.03.2018.
 */
public class ArrayChar {

    private	char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int x = 0; x != value.length; x++) {
            if (data[x] != value[x]) {
                result = false;
                break;
            }
        }
        return result;
    }
}