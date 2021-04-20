package behavioral.strategy;

import behavioral.strategy.impl.SelectionSortAlgorithm;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SortedList<T extends Comparable<T>> implements Printable {
    private SortAlgorithm sortAlgorithm;
    private List<T> list;

    public SortedList(List<T> list) {
        this(list, new SelectionSortAlgorithm());
    }

    public SortedList(List<T> list, SortAlgorithm sortAlgorithm) {
        this.list = new ArrayList<>(list);
        this.sortAlgorithm = sortAlgorithm;
    }

    public void sort() {
        this.sortAlgorithm.sort(this.list);
    }

    public void sort(SortAlgorithm strategy) {
        this.sortAlgorithm = strategy;
        strategy.sort(this.list);
    }

    @Override
    public void print() {
        System.out.println(list + " --- Using by" + sortAlgorithm.getClass().getSimpleName());
    }
}
