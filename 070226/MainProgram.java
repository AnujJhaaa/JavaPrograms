package com.codegnan.javaapp07022026.program;

import com.codegnan.javaapp07022026.shapes.Rectangle;
import com.codegnan.javaapp07022026.shapes.Square;
import com.codegnan.javaapp07022026.shapes.Cuboid;
import com.codegnan.javaapp07022026.shapes.Cube;

public class MainProgram {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(10,20);
        int areaRectangle = rectangle.calculateArea();
        int perimeterRectangle = rectangle.calculatePerimeter();
        System.out.println("Rectangle : area = " + areaRectangle + ", perimeter = " + perimeterRectangle);

        Square square = new Square(15);
        int perimeterSquare = square.calculatePerimeter();
        int areaSquare = square.calculateArea();
        System.out.println("Square : area = " + areaSquare + ", perimeter = " + perimeterSquare);
        
        Cuboid cuboid = new Cuboid(10,5,2);
        int volumeCuboid = cuboid.calculateVolume();
        int sufaceAreaCuboid = cuboid.calculateSurfaceArea();
        System.out.println("Cuboid : volume = " + volumeCuboid + ", surfacearea = " + sufaceAreaCuboid);

        Cube cube = new Cube(7);
        int volumeCube = cube.calculateVolume();
        int sufaceAreaCube = cube.calculateSurfaceArea();
        System.out.println("Cube : volume = " + volumeCube + ", surfacearea = " + sufaceAreaCube);

    }
}
