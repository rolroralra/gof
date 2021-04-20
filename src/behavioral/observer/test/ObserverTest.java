package behavioral.observer.test;

import behavioral.observer.impl.ObserverImpl;
import behavioral.observer.impl.SubjectImpl;
import lombok.Builder;
import lombok.Data;

import java.util.Observer;


public class ObserverTest {
    @Data
    @Builder
    static class Document {
        int id;
        String document;
    }

    public static void main(String[] args) {
        Document document = Document.builder()
                .id(1)
                .document("test")
                .build();

        System.out.println("[CURRENT DATA]");
        System.out.println(document);
        System.out.println();

        Observer observer = new ObserverImpl<Document>();
        SubjectImpl<Document> data = new SubjectImpl<>(document);
        data.addObserver(observer);
        document.setId(2);
        document.setDocument("changed Test");

        System.out.println("[CHANGED DATA]");
        data.set(document);

    }
}
