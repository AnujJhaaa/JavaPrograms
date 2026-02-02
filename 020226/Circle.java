package com.codegnan.javaapp02022026.shape;

// child/sub/derieved class
public class Circle extends Shape {
    public double pi = 3.14159;
    public double radius;

    public Circle(double radius, String color, String lineType) {
        this.radius = radius;
        super.color = color;
        super.lineType = lineType;
    }

    //method overriding
    @Override
    public int calculateArea() {
        int areaOfCircle = (int) (pi * radius * radius);
        return areaOfCircle;
    }

    //method overriding
    @Override
    public int calculatePerimeter() {
        int perimeterOfCircle = (int) (2 * pi * radius);
        return perimeterOfCircle;
    }

    public double getRadius() {
        return radius;
    }

    //method overriding
    @Override
    public void applyColor() {
        System.out.println(color + " color applied to fill the Circle.");
    }

    //method overriding
    @Override
    public void useLine() {
        System.out.println(lineType + " line used to make the Circle.");
    }
}