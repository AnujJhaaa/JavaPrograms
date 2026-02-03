package com.codegnan.javaapp0300226.program;

import com.codegnan.javaapp0300226.mathematics.Division;
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();

        Division division = new Division(num1, num2);

        int result = division.performDivision();
        System.out.printf("%d  / %d = %d\n",num1,num2,result);

    }
    
}
