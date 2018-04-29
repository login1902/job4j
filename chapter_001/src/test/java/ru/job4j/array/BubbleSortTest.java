package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{7, 5, 4, 2, 1};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{1, 2, 4, 5, 7};
        assertThat(result, is(expect));
    }
   }