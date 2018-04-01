package ru.job4j.array;

import java.util.Arrays;

public  class ArrayDuplicate {

    public String[] removeDuplicate(String[] arr) {
        int unique = arr.length;
        for (int out = 0; out < unique; out++) {
            for (int inner = out + 1; inner < unique; inner++) {
                if (arr[out].equals(arr[inner])) {
                    arr[inner] = null;
                    arr[inner] = arr[unique - 1];
                    unique--;
                }
            }
        }
        return Arrays.copyOf(arr, unique);
    }
}