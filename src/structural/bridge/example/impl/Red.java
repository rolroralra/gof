package structural.bridge.example.impl;

import structural.bridge.example.Color;

public class Red implements Color {
    @Override
    public String fill() {
        return "Red Color";
    }
}
