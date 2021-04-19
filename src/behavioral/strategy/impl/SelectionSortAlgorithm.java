package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.List;

public class SelectionSortAlgorithm<T extends Comparable<T>> implements SortAlgorithm<T> {
    @Override
    public void sort(List<T> original) {
        int size = original.size();
        for (int i = 0; i < size; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (original.get(index).compareTo(original.get(j)) > 0) {
                    index = j;
                }
            }

            if (i != index) {
                T temp = original.get(i);
                original.set(i, original.get(index));
                original.set(index, temp);
            }
        }
    }
}
