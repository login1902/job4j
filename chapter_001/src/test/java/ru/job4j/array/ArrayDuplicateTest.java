package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Иван", "Петр", "Иван", "Света", "Петр"};
        String[] except = {"Иван", "Света", "Петр"};
        ArrayDuplicate dublicate = new ArrayDuplicate();
        String[] result = dublicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}

