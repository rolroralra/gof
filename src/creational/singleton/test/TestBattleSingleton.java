package creational.singleton.test;

import static org.assertj.core.api.Assertions.assertThat;

import creational.singleton.SingleTon;
import creational.singleton.SingleTonWithSynchronized;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestBattleSingleton {
    @RepeatedTest(100)
    void test_fail_Singleton_Pattern_race_condition() {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        Set<Thread> threadSet = new HashSet<>();
        Set<SingleTonWithSynchronized> list = IntStream.range(0, 100)
            .parallel()
            .mapToObj(i -> executorService.submit(SingleTonWithSynchronized::getInstance2))
            .map(i -> {
                try {
                    threadSet.add(Thread.currentThread());
                    System.out.println(Thread.currentThread());
                    return i.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toSet());

        System.out.println(list);
        System.out.println(threadSet.size());
        assertThat(list).hasSize(1);    // Maybe failed at most one test case.
    }
    @Test
    public void test_Singleton_Pattern() {
        SingleTon singleTon = SingleTon.getInstance();

        System.out.println(singleTon == SingleTon.getInstance());
        System.out.println(singleTon);
        System.out.println(SingleTon.getInstance());

        // Compile Error
//        SingleObject anotherObject = new SingleObject();

        SingleTonWithSynchronized singleTonWithSynchronized = SingleTonWithSynchronized.getInstance();
        System.out.println(singleTonWithSynchronized == SingleTonWithSynchronized.getInstance());
        System.out.println(singleTonWithSynchronized);
        System.out.println(SingleTonWithSynchronized.getInstance());


        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        Set<Thread> threadSet = new HashSet<>();
        Set<SingleTonWithSynchronized> list = IntStream.range(0, 100)
            .parallel()
            .mapToObj(i -> executorService.submit(SingleTonWithSynchronized::getInstance))
            .map(i -> {
                try {
                    threadSet.add(Thread.currentThread());
                    System.out.println(Thread.currentThread());
                    return i.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toSet());

        System.out.println(list);
        System.out.println(threadSet.size());
    }

}
