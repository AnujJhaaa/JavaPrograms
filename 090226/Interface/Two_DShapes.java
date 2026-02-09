package com.codegnan.javaapp09022026.shapes;

public abstract class Two_DShapes implements Shape  {
    public abstract int calculateArea() ;
    public abstract int calculatePerimeter() ;

    /* non-abstract class does not force you to override the methods
    of parent class in child class. */
    
    /*public class Shapes {
    public int calculateArea() { 
        return 0;
    }

    public int calculatePerimeter() {
        return 0;
    }*/
}


