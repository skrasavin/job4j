package ru.job4j.array;

public class BigSecondArray {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] firstArray = new int[]{1, 2, 4, 5, 7};
        int[] secondArray = new int[]{2, 5, 6, 8, 9};
        int[] wholeArray = new int[10];
        int coun = 0;
        for (int count = 0; count < wholeArray.length / 2; count++) {
            wholeArray[coun] = firstArray[count];
            wholeArray[coun + 1] = secondArray[count];
            coun = coun + 2;
        }
            wholeArray = bs.sort(wholeArray);
            for (int in : wholeArray) {
                System.out.print(in);
            }
    }
}