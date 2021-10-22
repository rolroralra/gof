package creational.abstractFactory.test;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.FactoryProducer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class MainAbstractFactory {
    @Test
    public void test_Abstract_Factory_Pattern() {
        FactoryProducer factoryProducer = FactoryProducer.getInstance();

        AbstractFactory shapeFactory = factoryProducer.getFactory("Shape");

        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("SQUARE").draw();


        AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");

        colorFactory.getColor("RED").fill();
        colorFactory.getColor("GREEN").fill();
        colorFactory.getColor("Blue").fill();


        Assertions.assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(() -> {
            AbstractFactory dummyFactory = factoryProducer.getFactory("DUMMY");

            dummyFactory.getShape("Circle").draw();
            dummyFactory.getShape("Rectangle").draw();
            dummyFactory.getShape("SQUARE").draw();
        });


    }
}
