package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSortAlgorithm implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(List<T> original) {
        if (original.size() <= 1) {
            return;
        }

        int midIndex = original.size() / 2;
        sort(original.subList(0, midIndex));
        sort(original.subList(midIndex, original.size()));

        List<T> sortedList = new ArrayList<>();

        int leftPivot = 0;
        int rightPivot = midIndex;

        while (leftPivot < midIndex && rightPivot < original.size()) {
            if (original.get(leftPivot).compareTo(original.get(rightPivot)) <= 0) {
                sortedList.add(original.get(leftPivot++));
            } else {
                sortedList.add(original.get(rightPivot++));
            }
        }

        while (leftPivot < midIndex) {
            sortedList.add(original.get(leftPivot++));
        }

        while (rightPivot < original.size()) {
            sortedList.add(original.get(rightPivot++));
        }

        for (int i = 0; i < sortedList.size(); i++) {
            original.set(i, sortedList.get(i));
        }
    }


}
