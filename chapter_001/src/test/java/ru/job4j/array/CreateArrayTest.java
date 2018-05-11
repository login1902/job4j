package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateArrayTest {
    @Test
    public void whenFourDigits() {
        CreateArray word = new CreateArray();
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};
        int[] except = new int[]{1, 2, 3, 4};
        int[] result = word.createArray(a, b);
        assertThat(result, is(except));
    }

    @Test
    public void whenEightDigits() {
        CreateArray word = new CreateArray();
        int[] a = new int[]{1, 3, 5, 7};
        int[] b = new int[]{2, 4, 6, 8};
        int[] except = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = word.createArray(a, b);
        assertThat(result, is(except));
    }
}
