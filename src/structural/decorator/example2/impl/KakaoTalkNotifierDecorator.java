package structural.decorator.example2.impl;

import structural.decorator.example2.Notifier;
import structural.decorator.example2.NotifierDecorator;

public class KakaoTalkNotifierDecorator extends NotifierDecorator {
    public KakaoTalkNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        System.out.println("KAKAO Talk message sending...");
        notifier.notify(message);
    }
}
