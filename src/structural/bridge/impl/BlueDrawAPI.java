package structural.bridge.impl;

import structural.bridge.DrawAPI;

public class BlueDrawAPI implements DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println(this.getClass().getSimpleName() + "::drawCircle() called!");
        System.out.println("BlueCircle[x = " + x + ", y = " + y + ", radius = " + radius +"]");
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.println(this.getClass().getSimpleName() + "::drawRectangle() called!");
        System.out.println("BlueRectangle[width = " + width + ", height = " + height + "]");
    }

    @Override
    public void drawSquare(int length) {
        System.out.println(this.getClass().getSimpleName() + "::drawSquare() called!");
        System.out.println("BlueSquare[length = " + length + "]");
    }
}
