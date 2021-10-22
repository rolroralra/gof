package structural.facade.test;

import org.junit.jupiter.api.Test;
import structural.facade.ShapeFacade;
import structural.facade.impl.ShapeFacadeImpl;

public class TestBattleFacade {
    @Test
    public void test_Facade_Pattern() {
        ShapeFacade shapeFacade = new ShapeFacadeImpl();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
