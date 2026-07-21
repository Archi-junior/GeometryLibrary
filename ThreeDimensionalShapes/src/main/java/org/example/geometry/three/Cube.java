package org.example.geometry.three;

public class Cube implements ThreeDShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    public double getSide() {
        return side;
    }

    public double getExtraSide() {
        return side * side;
    }
}