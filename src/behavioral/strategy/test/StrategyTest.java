package behavioral.strategy.test;

import behavioral.strategy.SortedList;
import behavioral.strategy.impl.BubbleSortAlgorithm;
import behavioral.strategy.impl.InsertionSortAlgorithm;
import behavioral.strategy.impl.SelectionSortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StrategyTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{
            IntStream.range(0, 10).forEach(i -> add((int)(Math.random() * 20)));
        }};

        System.out.println("[ORIGINAL ARRAY]");
        System.out.println(list);
        System.out.println();

        SortedList[] sortedListArray = new SortedList[] {
                new SortedList<>(list, new SelectionSortAlgorithm()),
                new SortedList<>(list, new InsertionSortAlgorithm()),
                new SortedList<>(list, new BubbleSortAlgorithm()),
        };

        Arrays.stream(sortedListArray).forEach(SortedList::sort);
        System.out.println("[SORTED ARRAY]");
        Arrays.stream(sortedListArray).forEach(SortedList::print);

    }
}
