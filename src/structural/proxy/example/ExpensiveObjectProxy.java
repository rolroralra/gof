package structural.proxy.example;

import java.util.Objects;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if(Objects.isNull(object)) {
            object = new ExpensiveObjectImpl();
        }

        object.process();
    }
}
