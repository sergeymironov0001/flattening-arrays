package org.sergeymironov0001.flatteningarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FlatteningArrays {

    public static Object[] nonRecursiveFlatten(Object[] array) {
        validateArray(array);

        return null;
    }

    public static Object[] recursiveFlatten(Object[] array) {
        validateArray(array);

        List<Object> total = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Object[]) {
                Object[] flattenedArray = recursiveFlatten((Object[]) element);
                total.addAll(Arrays.asList(flattenedArray));
            } else {
                total.add(element);
            }
        }
        return total.toArray();
    }

    private static void validateArray(Object[] array) {
        if (Objects.isNull(array)) {
            throw new IllegalArgumentException("Array can't be null");
        }
    }
}
