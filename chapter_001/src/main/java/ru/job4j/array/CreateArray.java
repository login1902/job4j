package ru.job4j.array;

import java.util.Arrays;

public class CreateArray {

    public int[] createArray(int[] first, int[] second) {
        int[] array = new int[first.length + second.length];

        System.arraycopy(first, 0, array, 0, first.length);

        System.arraycopy(second, 0, array, first.length, second.length);

        Arrays.sort(array);
                return array;
    }


}


    


