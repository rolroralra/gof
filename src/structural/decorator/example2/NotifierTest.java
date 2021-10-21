package structural.decorator.example2;

import org.junit.jupiter.api.Test;
import structural.decorator.example2.impl.EmailNotifierDecorator;
import structural.decorator.example2.impl.KakaoTalkNotifierDecorator;
import structural.decorator.example2.impl.NotifierImpl;
import structural.decorator.example2.impl.SmsNotifierDecorator;

public class NotifierTest {

    @Test
    void test_Decorator_Pattern_Example2() {
        Notifier notifier = new NotifierImpl();

        Notifier kakaoTalkNotifier = new KakaoTalkNotifierDecorator(notifier);
        Notifier emailNotifier = new EmailNotifierDecorator(notifier);
        Notifier smsNotifier = new SmsNotifierDecorator(notifier);

        kakaoTalkNotifier.notifyMessage("kakao talk message?!");
        emailNotifier.notifyMessage("email message?!");
        smsNotifier.notifyMessage("sms message?!");
    }
}
