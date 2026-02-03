package com.codegnan.javaapp0300226.mathematics;

public class Division {
    public int num1 ;
    public int num2;

    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int performDivision() {
        int resultDivision = 0;
        try{
            resultDivision = num1 / num2 ;
        } catch(ArithmeticException e){
            System.out.println("Exception found : " + e);
        }

        return resultDivision;
    }
}