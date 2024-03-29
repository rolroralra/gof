package structural.decorator.example2.impl;

import structural.decorator.example2.Notifier;
import structural.decorator.example2.NotifierDecorator;

public class EmailNotifierDecorator extends NotifierDecorator {
    public EmailNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        System.out.println("Email sending...");
        notifier.notify(message);
    }
}
