package structural.facade.test;

import structural.facade.ShapeFacade;
import structural.facade.impl.ShapeFacadeImpl;

public class MainFacade {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacadeImpl();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
