package structural.decorator.example2.impl;

import structural.decorator.example2.Notifier;

public class NotifierImpl implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("[NOTICE] " + message);
    }
}
