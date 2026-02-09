package com.codegnan.javaapp09022026.shapes;

public class Cuboid extends Three_DShapes {
    public int length;
    public int breadth;
    public int width;

    public Cuboid(int length, int breadth, int width) {
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }

    public Cuboid() {}

    @Override
    public int calculateSurfaceArea() {
        return 2*((length*breadth) + (breadth*width) + (length*width));
        
    }

    @Override
    public int calculateVolume() {
        return length*breadth*width;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Width : " + width);
    }
}
