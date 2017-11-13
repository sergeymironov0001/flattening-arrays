package org.sergeymironov0001.flatteningarrays;

import java.util.Objects;

public interface IFlatteningArrays {

    Object[] flatten(Object[] array);

    default void validateArray(Object[] array) {
        if (Objects.isNull(array)) {
            throw new IllegalArgumentException("Array can't be null");
        }
    }
}
