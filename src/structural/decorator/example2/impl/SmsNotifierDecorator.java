package structural.decorator.example2.impl;

import structural.decorator.example2.Notifier;
import structural.decorator.example2.NotifierDecorator;

public class SmsNotifierDecorator extends NotifierDecorator {
    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyMessage(String message) {
        System.out.println("SMS message sending...");
        notifier.notifyMessage(message);
    }
}
