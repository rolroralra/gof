package behavioral.strategy.test;

import behavioral.strategy.SortedList;
import behavioral.strategy.impl.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StrategyTest {
    @RepeatedTest(10)
    void test_Strategy_Pattern() {
        List<Integer> list = new ArrayList<Integer>(){{
            IntStream.range(0, 10).forEach(i -> add((int)(Math.random() * 20)));
        }};

        System.out.println("[ORIGINAL ARRAY]");
        System.out.println(list);
        System.out.println();

        @SuppressWarnings("rawtypes")
        SortedList[] sortedListArray = new SortedList[] {
                new SortedList<>(new ArrayList<>(list), new SelectionSortAlgorithm()),
                new SortedList<>(new ArrayList<>(list), new InsertionSortAlgorithm()),
                new SortedList<>(new ArrayList<>(list), new BubbleSortAlgorithm()),
                new SortedList<>(new ArrayList<>(list), new MergeSortAlgorithm()),
                new SortedList<>(new ArrayList<>(list), new QuickSortAlgorithm()),
                new SortedList<>(new ArrayList<>(list), new HeapSortAlgorithm())
        };

        Arrays.stream(sortedListArray).forEach(SortedList::sort);
        System.out.println("[SORTED ARRAY]");
        Arrays.stream(sortedListArray).forEach(SortedList::print);

        Arrays.stream(sortedListArray).forEach(sortedList -> Assertions.assertThat(sortedList.getList()).isSorted());
    }
}

