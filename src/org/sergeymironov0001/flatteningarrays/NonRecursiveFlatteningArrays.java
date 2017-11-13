package org.sergeymironov0001.flatteningarrays;

import java.util.*;

public class NonRecursiveFlatteningArrays implements IFlatteningArrays {

    @Override
    public Object[] flatten(Object[] array) {
        validateArray(array);

        Deque<Pair<Object[], Integer>> stack = new LinkedList<>();
        stack.push(new Pair<>(array, 0));
        List<Object> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            Pair<Object[], Integer> pair = stack.pop();
            Object[] tmpArray = pair.getFirst();
            int i = pair.getSecond();
            for (; i < tmpArray.length; i++) {
                if (tmpArray[i] instanceof Object[]) {
                    stack.push(new Pair<>(tmpArray, i + 1));
                    tmpArray = (Object[]) tmpArray[i];
                    i = -1;
                } else {
                    result.add(tmpArray[i]);
                }
            }
        }
        return result.toArray();
    }

    private static class Pair<F, S> {
        private final F first;
        private final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }
    }
}
