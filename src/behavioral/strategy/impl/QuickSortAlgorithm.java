package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.List;

public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(List<T> original) {
        if (original.size() <= 1) {
            return;
        }

        int index = 0;
        final int pivot = 0;

        for (int i = 1; i < original.size(); i++) {
            if (original.get(pivot).compareTo(original.get(i)) > 0) {
                swap(++index, i, original);
            }
        }

        swap(index, pivot, original);
        sort(original.subList(0, index));
        sort(original.subList(index + 1, original.size()));
    }

    private <T> void swap(int left, int right, List<T> original) {
        if (left == right) {
            return;
        }

        T temp = original.get(left);

        original.set(left, original.get(right));
        original.set(right, temp);
    }
}
