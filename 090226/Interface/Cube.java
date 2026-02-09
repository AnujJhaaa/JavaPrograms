package com.codegnan.javaapp09022026.shapes.three_dshapes;

import com.codegnan.javaapp09022026.shapes.Shape;
import com.codegnan.javaapp09022026.shapes.Three_DShapes;

public class Cube extends Three_DShapes implements Shape {
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
