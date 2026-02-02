package com.codegnan.javaapp02022026.program;

import com.codegnan.javaapp02022026.shape.Rectangle;
import com.codegnan.javaapp02022026.shape.Circle;

public class MainProgram {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(10, 5, "Red", "Solid");
        rectangle1.applyColor();
        rectangle1.useLine();
        System.out.println("Length of the rectangle = " + rectangle1.getLength());
        System.out.println("Width of the rectangle = " + rectangle1.getWidth());
        System.out.println("Area of the rectangle = " + rectangle1.calculateArea());
        System.out.println("Perimeter of the rectangle = " + rectangle1.calculatePerimeter());

        System.out.println();

        Rectangle rectangle2 = new Rectangle(20, 10, "Yellow", "Dashed");
        rectangle2.applyColor();
        rectangle2.useLine();
        System.out.println("Length of the rectangle = " + rectangle2.getLength());
        System.out.println("Width of the rectangle = " + rectangle2.getWidth());
        System.out.println("Area of the rectangle = " + rectangle2.calculateArea());
        System.out.println("Perimeter of the rectangle = " + rectangle2.calculatePerimeter());

        System.out.println();

        Circle circle1 = new Circle(5.2, "Blue", "Solid");
        circle1.applyColor();
        circle1.useLine();
        System.out.println("Radius of the circle = " + circle1.getRadius());
        System.out.println("Area of the circle = " + circle1.calculateArea());
        System.out.println("Perimeter of the circle1 = " + circle1.calculatePerimeter());
    }
}
