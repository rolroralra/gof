package behavioral.strategy.example.impl;

import behavioral.strategy.example.PaymentStrategy;
import behavioral.strategy.example.ShoppingCart;

import java.util.Arrays;

public enum Payment implements PaymentStrategy {
    KAKAO_PAYMENT {
        @Override
        public void pay(ShoppingCart shoppingCart, Object[] args) {
            if (checkArgumentSize(2, args)) {
                return;
            }

            System.out.printf("%d paid with %s [id=%s, password=%s]%n", shoppingCart.calculateTotal(), this.name(), args[0], args[1]);
        }
    },
    NAVER_PAYMENT {
        @Override
        public void pay(ShoppingCart shoppingCart, Object[] args) {
            if (checkArgumentSize(2, args)) {
                return;
            }

            System.out.printf("%d paid with %s [id=%s, password=%s]%n", shoppingCart.calculateTotal(), this.name(), args[0], args[1]);
        }
    },
    CREDIT_CARD_PAYMENT {
        @Override
        public void pay(ShoppingCart shoppingCart, Object[] args) {
            if (checkArgumentSize(4, args)) {
                return;
            }

            System.out.printf("%d paid with %s [name=%s, ccNum=%s, cvv=%s, expiryDate=%s]%n", shoppingCart.calculateTotal(), this.name(), args[0], args[1], args[2], args[3]);
        }
    };

    public static Payment getDefault() {
        return CREDIT_CARD_PAYMENT;
    }

    boolean checkArgumentSize(int size, Object[] args) {
        return args == null || args.length < size;
    }

    @Override
    public void pay(ShoppingCart shoppingCart, Object[] args) {
        System.out.printf("%d paid with %s [args=%s]%n", shoppingCart.calculateTotal(), this.name(), Arrays.toString(args));
    }
}
