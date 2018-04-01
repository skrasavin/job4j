package ru.job4j.array;

/**
 * нахождение слова в слове.
 * @author - skrasavin.
 * @since - 01.04.2018.
 */
public class InnerArray {
    /**
     * метод поиска слова в слове.
     * @param wd
     * @param partOfWd
     * @return
     */
    public boolean startWith(String wd, String partOfWd) {
        boolean result = true;
        char[] value = wd.toCharArray();
        char[] newValue = partOfWd.toCharArray();
        int count = 0;
        for (int x = 0; x < value.length; x++) {
            if (value[x] == newValue[count]) {
                result = false;
                count++;
            }
            if (count == newValue.length) {
                return true;
            }
        }
        return result;
    }
}