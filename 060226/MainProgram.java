package com.codegnan.javaapp06022026.program;

import com.codegnan.javaapp06022026.banking.BankingOperations;
import com.codegnan.javaapp06022026.customexception.InsufficientBalanceException;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("main() started.");

        BankingOperations bankingOperations = new BankingOperations();

        try{
            double availableBalance = bankingOperations.withdraw(10000.0, 50000.0);
            System.out.println("Transaction Successful.");
            System.out.println("Current Balance = " + availableBalance);
        }   catch(InsufficientBalanceException ISBex) {
                ISBex.printStackTrace();
            }

        System.out.println("main() ended.");
    }
}
