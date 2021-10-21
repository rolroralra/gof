package structural.filter.test;

import org.junit.jupiter.api.Test;
import structural.filter.Filter;
import structural.filter.impl.FilterImpl;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainFilter {
    @Test
    public void test_Filter_Pattern() {

        @SuppressWarnings("rawtypes")
//        Filter defaultFilter = FilterImpl.defaultFilter();    // Deprecated
        Filter defaultFilter = Filter.getDefaultFilter();

        Filter<String> stringFilter = new FilterImpl<>(s -> s.length() < 5);
        Filter<String> defaultStringFilter = new FilterImpl<>();
        Iterable<String> stringDataList = Arrays.asList("abcd", "test1234", "Hello", "123");


//        stringFilter.filter(stringDataList).forEach(s -> System.out.println(s));
        printFilteringResult(stringDataList, stringFilter);

        System.out.println("---");

        printFilteringResult(stringDataList, defaultStringFilter);
//        defaultStringFilter.filter(stringDataList).forEach(s -> System.out.println(s));
        System.out.println("---");

        printFilteringResult(stringDataList, defaultFilter);
        System.out.println("---");


        Iterable<Integer> integerDataList = IntStream.range(1,10).boxed().collect(Collectors.toList());

        Filter<Integer> integerFilter = new FilterImpl<>(i -> i > 5);
        Filter<Integer> defaultIntegerFilter = new FilterImpl<>();

//        integerFilter.filter(integerDataList).forEach(i -> System.out.println(i));
        printFilteringResult(integerDataList, integerFilter);
        System.out.println("---");
//        defaultIntegerFilter.filter(integerDataList).forEach(i -> System.out.println(i));
        printFilteringResult(integerDataList, defaultIntegerFilter);
        System.out.println("---");

        printFilteringResult(integerDataList, defaultFilter);
        System.out.println("---");

    }

    @SuppressWarnings("rawtypes")
    public static void printFilteringResult(Iterable iterable, Filter filter) {
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        filter.filter(iterable).forEach(obj -> sj.add(obj.toString()));
        System.out.println(sj);
    }
}
