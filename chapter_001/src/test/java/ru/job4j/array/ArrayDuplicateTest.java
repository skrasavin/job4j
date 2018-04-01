package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public  class ArrayDuplicateTest {
    @Test
    public void whenDuplicateRemoveDuplicateArray() {
        ArrayDuplicate adt = new ArrayDuplicate();
        String[] arr = new String[]{"Sveta", "Lina", "Olga", "Nastya", "Lina"};
        String[] arrTest = adt.removeDuplicate(arr);
        String[] except = new String[]{"Sveta", "Lina", "Olga", "Nastya"};

        assertThat(except, is(arrTest));

    }
}
