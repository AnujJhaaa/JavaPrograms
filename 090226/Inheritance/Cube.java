package com.codegnan.javaapp09022026.shapes;

public class Cube extends Three_DShapes {
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

     @Override
    public void displayShapeInfo() {
        System.out.println("Side-length : " + side);
    }
}
