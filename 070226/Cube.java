package com.codegnan.javaapp07022026.shapes;

public class Cube extends Three_DShapes{
    public int side;

    public Cube(int side) {
        this.side = side;
    }

    public Cube() {}

    @Override
    public int calculateSurfaceArea() {
        return 6*(side * side);
    }

    @Override
    public int calculateVolume() {
        return side*side*side;
    }
}
