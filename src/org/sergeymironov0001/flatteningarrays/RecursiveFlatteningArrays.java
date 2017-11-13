package org.sergeymironov0001.flatteningarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveFlatteningArrays implements IFlatteningArrays {

    @Override
    public Object[] flatten(Object[] array) {
        validateArray(array);

        List<Object> total = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Object[]) {
                Object[] flattenedArray = flatten((Object[]) element);
                total.addAll(Arrays.asList(flattenedArray));
            } else {
                total.add(element);
            }
        }
        return total.toArray();
    }
}
