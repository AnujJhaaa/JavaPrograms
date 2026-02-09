package com.codegnan.javaapp09022026.shapes.generalshape;

import com.codegnan.javaapp09022026.shapes.Shape;

public class Arrow extends GeneralShape implements Shape {
    @Override
    public void draw(){
        System.out.println("Drawing an arrow.");
    }    
    
    @Override
    public void fillColor(){
        System.out.println("Filling color blue to the arrow.");
    }

    @Override
        public void displayShapeInfo()
        {
            System.out.println("This is a blue color, arrow shape.");
        }
}
