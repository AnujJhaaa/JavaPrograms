package com.codegnan.javaapp09022026.program;

import com.codegnan.javaapp09022026.shapes.two_dshapes.Rectangle;
import com.codegnan.javaapp09022026.shapes.three_dshapes.Cube;
import com.codegnan.javaapp09022026.shapes.generalshape.Arrow;
import com.codegnan.javaapp09022026.shapes.generalshape.Star;


public class MainProgram {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.displayShapeInfo();
        int areaRectangle = rectangle.calculateArea();
        int perimeterRectangle = rectangle.calculatePerimeter();
        System.out.println("Rectangle : area = " + areaRectangle + ", perimeter = " + perimeterRectangle);
        System.out.println();


        Cube cube = new Cube(7);
        cube.displayShapeInfo();
        int volumeCube = cube.calculateVolume();
        int sufaceAreaCube = cube.calculateSurfaceArea();
        System.out.println("Cube : volume = " + volumeCube + ", surfacearea = " + sufaceAreaCube);
        System.out.println();

        Star star = new Star();
        star.draw();
        star.fillColor();
        star.displayShapeInfo();
        System.out.println();

        Arrow arrow = new Arrow();
        arrow.draw();
        arrow.fillColor();
        arrow.displayShapeInfo();
        System.out.println();
    }
}
