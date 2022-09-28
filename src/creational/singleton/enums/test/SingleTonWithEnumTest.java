package creational.singleton.enums.test;

import creational.singleton.enums.SingleTonWithEnum;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class SingleTonWithEnumTest {

    @Test
    void test() {

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);

        Set<Thread> threadSet = new HashSet<>();
        Set<SingleTonWithEnum> set = IntStream.range(0, 100)
            .parallel()
            .mapToObj(i -> executorService.submit(SingleTonWithEnum::getInstance))
            .map(i -> {
                try {
                    threadSet.add(Thread.currentThread());
                    System.out.println(Thread.currentThread());
                    return i.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toSet());

        System.out.println("processor count: " + Runtime.getRuntime().availableProcessors());
        System.out.println(threadSet);
        System.out.println(threadSet.size());

        System.out.println(set);
        SingleTonWithEnum singleTonWithEnum = SingleTonWithEnum.getInstance();
        System.out.println(singleTonWithEnum == SingleTonWithEnum.getInstance());
        System.out.println(singleTonWithEnum);
        System.out.println(singleTonWithEnum.getInstance());
    }
}
