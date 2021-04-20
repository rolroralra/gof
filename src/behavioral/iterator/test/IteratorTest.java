package behavioral.iterator.test;

import behavioral.iterator.Iterable;
import behavioral.iterator.Iterator;
import behavioral.iterator.impl.IterableImpl;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    @Data
    @Builder
    static class DataDTO {
        private int id;
        private String document;
    }

    public static void main(String[] args) {
        List<DataDTO> list = new ArrayList<DataDTO>(){{
            add(DataDTO.builder().id(1).document("test").build());
            add(DataDTO.builder().id(2).document("test2").build());
            add(DataDTO.builder().id(3).document("test3").build());
            add(DataDTO.builder().id(4).document("test4").build());
        }};

        Iterable<DataDTO> repository = new IterableImpl<>(list);

        Iterator<DataDTO> iterator = repository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
