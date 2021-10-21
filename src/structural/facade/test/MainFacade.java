package structural.facade.test;

import org.junit.jupiter.api.Test;
import structural.facade.ShapeFacade;
import structural.facade.impl.ShapeFacadeImpl;

public class MainFacade {
    @Test
    public void test_Facade_Pattern(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacadeImpl();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
