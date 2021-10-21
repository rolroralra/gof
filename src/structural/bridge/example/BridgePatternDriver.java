package structural.bridge.example;

import structural.bridge.example.impl.Blue;
import structural.bridge.example.impl.Red;
import structural.bridge.example.impl.Square;
import structural.bridge.example.impl.Triangle;

public class BridgePatternDriver {

    public static void main(String[] args) {
        //
        Shape square = new Square(new Red());
        System.out.println(square.draw());
        
        //a triangle with blue color
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}
