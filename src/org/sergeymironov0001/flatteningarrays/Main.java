package org.sergeymironov0001.flatteningarrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Object[] array = createArray(1, 2, 3, createArray(4, 5));
        System.out.println(Arrays.asList(FlatteningArrays.recursiveFlatten(array)));

        Object[] array1 = createArray(1, createArray(2, createArray(3, createArray(4, 5))));
        System.out.println(Arrays.asList(FlatteningArrays.recursiveFlatten(array1)));
    }

    private static Object[] createArray(Object... elements) {
        return elements;
    }
}
