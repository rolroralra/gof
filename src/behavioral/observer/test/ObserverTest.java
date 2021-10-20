package behavioral.observer.test;

import behavioral.observer.impl.ObserverImpl;
import behavioral.observer.impl.ObserverImpl2;
import behavioral.observer.impl.SubjectImpl;
import behavioral.observer.impl.SubjectImpl2;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Observer;


public class ObserverTest {
    @Data
    @Builder
    static class Document {
        int id;
        String document;
    }

    @Test
    void test_Observer_Pattern() {
        Document document = Document.builder()
                .id(1)
                .document("test")
                .build();

        System.out.println("[CURRENT DATA]");
        System.out.println(document);
        System.out.println();

        Observer observer = new ObserverImpl<Document>();
        SubjectImpl<Document> subject = new SubjectImpl<>(document);
        subject.addObserver(observer);
        document.setId(2);
        document.setDocument("changed Test");

        System.out.println("[CHANGED DATA]");
        subject.set(document);


        behavioral.observer.Observer observer2 = new ObserverImpl2<Document>();
        SubjectImpl2<Document> subject2 = new SubjectImpl2<>(document);
        subject2.addObserver(observer2);

        document.setId(3);
        document.setDocument("changed Test -- 2");

        System.out.println("[CHANGED DATA]");
        subject.set(document);
        subject2.set(document);
    }
}
