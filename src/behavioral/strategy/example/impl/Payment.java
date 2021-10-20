package behavioral.strategy.example.impl;

import behavioral.strategy.example.PayStrategy;
import behavioral.strategy.example.ShoppingCart;

import java.util.Arrays;

public enum Payment implements PayStrategy {
    KAKAO_PAYMENT {

    },
    NAVER_PAYMENT {

    },
    CREDIT_CARD_PAYMENT {
        @Override
        public void pay(ShoppingCart shoppingCart, Object... args) {
            if (args == null || args.length < 4) {
                return;
            }

            System.out.printf("%d paid with credit/debit card [name=%s, ccNum=%s, cvv=%s, expiryDate=%s]%n", shoppingCart.calculateTotal(), args[0], args[1], args[2], args[3]);
        }
    };

    public static Payment getDefault() {
        return CREDIT_CARD_PAYMENT;
    }

    @Override
    public void pay(ShoppingCart shoppingCart, Object... args) {
        System.out.printf("%d paid with %s [args=%s]%n", shoppingCart.calculateTotal(), this.name(), Arrays.toString(args));
    }
}
