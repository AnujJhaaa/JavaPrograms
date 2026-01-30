package com.codegnan.javaapp300126.pack2;

import com.codegnan.javaapp300126.pack1.Greeting;

public class MainProgram2 {
    public static void main(String[] args) {
        Greeting object = new Greeting();

        object.hello();
        // object.hi(); -- not accesible as it is a protected method()
        // object.bye(); -- not accesible as it is a private method()
        // object.hey(); -- not accesible as it is a deafault method()
    }
}
