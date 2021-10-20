package behavioral.strategy.impl;

import behavioral.strategy.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSortAlgorithm implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> void sort(List<T> original) {
        List<T> copiedList = new ArrayList<>(original);
        PriorityQueue<T> priorityQueue = new PriorityQueue<>(copiedList);

        for (int i = 0; i < original.size(); i++) {
            original.set(i, priorityQueue.poll());
        }
    }
}
