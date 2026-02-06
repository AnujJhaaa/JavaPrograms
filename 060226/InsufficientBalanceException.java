package com.codegnan.javaapp06022026.customexception;

/* if a class extends RuntimeException class it is an unchecked exception 
and is not notified by the compiler during compilation.
if a class extends Exception class it is a checked exception and needs to be
handled using try-catch or declared using 'throws' keyword 
or compiler notifies us of it.  */
public class InsufficientBalanceException extends Exception {
    @Override
    public String getMessage(){
        return "Sorry, insufficient balance!";
    }
}
