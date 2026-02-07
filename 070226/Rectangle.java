package com.codegnan.javaapp07022026.shapes;

public class Rectangle extends Two_DShapes {

    public int length;
    public int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle() {}

    @Override
    public int calculateArea() {
        return length*width;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(length+width);
    }

}
