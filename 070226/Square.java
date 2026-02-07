package com.codegnan.javaapp07022026.shapes;

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

}
