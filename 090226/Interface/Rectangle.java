package com.codegnan.javaapp09022026.shapes.two_dshapes;

import com.codegnan.javaapp09022026.shapes.Two_DShapes;

public class Rectangle extends Two_DShapes {

    public int length;
    public int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {}

    @Override
    public int calculateArea() {
        return length*breadth;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(length+breadth);
    }

     @Override
    public void displayShapeInfo() {
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
    }

}
