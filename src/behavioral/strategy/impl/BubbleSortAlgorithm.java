package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.List;

public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(List<T> original) {
        int size = original.size();
        for (int i = 1; i < size ; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < size - i; j++) {
                if (original.get(j + 1).compareTo(original.get(j)) < 0) {
                    isSwapped = true;
                    T temp = original.get(j);
                    original.set(j, original.get(j + 1));
                    original.set(j + 1, temp);
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }
}
