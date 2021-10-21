package structural.bridge.example.impl;

import structural.bridge.example.Color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "Blue Color";
    }
}
