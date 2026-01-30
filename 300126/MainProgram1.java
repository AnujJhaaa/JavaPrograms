package com.codegnan.javaapp300126.pack1;

public class MainProgram1 {
    public static void main(String[] args) {
        Greeting object = new Greeting();

        object.hello();
        object.hi();
        // object.bye(); -- not accesible as it is a private method()
        object.hey();
    }
}
