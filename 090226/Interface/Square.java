package com.codegnan.javaapp09022026.shapes.two_dshapes;

import com.codegnan.javaapp09022026.shapes.Two_DShapes;

public class Square extends Two_DShapes {

    public int side ;

    public Square(int side){
        this.side = side;
    }

    public Square() {}

    @Override
    public int calculateArea() {
        return side*side;
    }

    @Override
    public int calculatePerimeter() {
        return 4*side;
    }

     @Override
    public void displayShapeInfo() {
        System.out.println("Side-length : " + side);
    }

}
