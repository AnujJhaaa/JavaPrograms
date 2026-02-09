package com.codegnan.javaapp09022026.shapes.generalshape;

import com.codegnan.javaapp09022026.shapes.Shape;

public class Star extends GeneralShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Star.");
    }

    @Override
    public void fillColor(){
        System.out.println("Filling color yellow to the star.");
    }

    @Override
        public void displayShapeInfo()
        {
            System.out.println("This is a yellow color, star shape.");
        }
}
