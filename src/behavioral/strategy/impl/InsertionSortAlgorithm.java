package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.List;

public class InsertionSortAlgorithm<T extends Comparable<T>> implements SortAlgorithm<T>  {
    public InsertionSortAlgorithm() {
    }

    @Override
    public void sort(List<T> original) {
        int size = original.size();
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && original.get(j).compareTo(original.get(j - 1)) < 0; j--) {
                T temp = original.get(j);
                original.set(j, original.get(j - 1));
                original.set(j - 1, temp);
            }
        }
    }
}
