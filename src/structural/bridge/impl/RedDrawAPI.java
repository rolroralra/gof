package structural.bridge.impl;

import structural.bridge.DrawAPI;

public class RedDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println(this.getClass().getSimpleName() + "::drawCircle() called!");
        System.out.println("RedCircle[x = " + x + ", y = " + y + ", radius = " + radius +"]");
    }

    @Override
    public void drawRectangle(int width, int height) {
        System.out.println(this.getClass().getSimpleName() + "::drawRectangle() called!");
        System.out.println("RedRectangle[width = " + width + ", height = " + height + "]");
    }
}
