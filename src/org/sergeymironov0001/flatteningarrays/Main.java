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
        // [[1, 2],[3, 4, 5], [6, 7, 8, 9]]
        Object[] array = createArray(
                createArray(1, 2),
                createArray(3, 4, 5),
                createArray(6, 7, 8, 9)
        );
        System.out.println(Arrays.asList(flatteningArrays.flatten(array)));


        // [[[1, [2]],[3, 4, 5]], [6, [7, [8]],9]]
        Object[] array1 = createArray(
                createArray(
                        createArray(1,
                                createArray(2)),
                        createArray(3, 4, 5)),
                createArray(6,
                        createArray(7, createArray(8)),
                        9)
        );
        System.out.println(Arrays.asList(flatteningArrays.flatten(array1)));


        // [[1,[2,[[3]]]],4,[5,[[[6]]]]]
        Object[] array2 = createArray(
                createArray(1,
                        createArray(2,
                                createArray(3))),
                4,
                createArray(5,
                        createArray(
                                createArray(
                                        createArray(6))))
        );
        System.out.println(Arrays.asList(flatteningArrays.flatten(array2)));
    }


    private static Object[] createArray(Object... elements) {
        return elements;
    }
}
