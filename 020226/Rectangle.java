package com.codegnan.javaapp02022026.shape;

// child/sub/derieved class
public class Rectangle extends Shape {
    public int length;
    public int width;

    public Rectangle(int length, int width, String color, String lineType) {
        this.length = length;
        this.width = width;
        super.color = color;
        super.lineType = lineType;
    }

    //method overriding
    @Override
    public int calculateArea() {
        int areaOfSquare = length * width;
        return areaOfSquare;
    }
    //method overriding
    @Override
    public int calculatePerimeter() {
        int perimeterOfSquare = 2 * (length + width);
        return perimeterOfSquare;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    //method overriding
    @Override
    public void applyColor() {
        System.out.println(color + " color applied to fill the Rectangle.");
    }

    //method overriding
    @Override
    public void useLine() {
        System.out.println(lineType + " line used to make the Rectangle.");
    }
}