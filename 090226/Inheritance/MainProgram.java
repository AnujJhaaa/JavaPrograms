package com.codegnan.javaapp09022026.program;

import com.codegnan.javaapp09022026.shapes.Rectangle;
import com.codegnan.javaapp09022026.shapes.Square;
import com.codegnan.javaapp09022026.shapes.Cuboid;
import com.codegnan.javaapp09022026.shapes.Cube;

public class MainProgram {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.displayShapeInfo();
        int areaRectangle = rectangle.calculateArea();
        int perimeterRectangle = rectangle.calculatePerimeter();
        System.out.println("Rectangle : area = " + areaRectangle + ", perimeter = " + perimeterRectangle);
        System.out.println();

        Square square = new Square(15);
        square.displayShapeInfo();
        int perimeterSquare = square.calculatePerimeter();
        int areaSquare = square.calculateArea();
        System.out.println("Square : area = " + areaSquare + ", perimeter = " + perimeterSquare);
        System.out.println();
        
        Cuboid cuboid = new Cuboid(10,5,2);
        cuboid.displayShapeInfo();
        int volumeCuboid = cuboid.calculateVolume();
        int sufaceAreaCuboid = cuboid.calculateSurfaceArea();
        System.out.println("Cuboid : volume = " + volumeCuboid + ", surfacearea = " + sufaceAreaCuboid);
        System.out.println();

        Cube cube = new Cube(7);
        cube.displayShapeInfo();
        int volumeCube = cube.calculateVolume();
        int sufaceAreaCube = cube.calculateSurfaceArea();
        System.out.println("Cube : volume = " + volumeCube + ", surfacearea = " + sufaceAreaCube);
        System.out.println();

    }
}
