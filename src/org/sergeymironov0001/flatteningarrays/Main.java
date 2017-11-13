package org.sergeymironov0001.flatteningarrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Recursive flattening:");
        testFlattening(new RecursiveFlatteningArrays());

        System.out.println("Non recursive flattening:");
        testFlattening(new NonRecursiveFlatteningArrays());
    }

    private static void testFlattening(IFlatteningArrays flatteningArrays) {
        Object[] array = createArray(1, 2, 3, createArray(4, 5));
        System.out.println(Arrays.asList(flatteningArrays.flatten(array)));

        Object[] array1 = createArray(1, createArray(2, createArray(3, createArray(4, 5))));
        System.out.println(Arrays.asList(flatteningArrays.flatten(array1)));
    }


    private static Object[] createArray(Object... elements) {
        return elements;
    }
}
