package com.codegnan.javaapp300126.pack1;

public class Greeting { 
    protected String name = "Person1";
    private String name1 = "Person2";
    public void hello() {
        System.out.println("hello" + name);
        System.out.println("hello" + name1);
    }

    protected void hi() {
        System.out.println("hi");
    }

    private void bye() {
        System.out.println("bye");
    }
    
    void hey() {
        System.out.println("hey");
    }
}