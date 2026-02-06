package com.codegnan.javaapp06022026.banking;

import com.codegnan.javaapp06022026.customexception.InsufficientBalanceException;

public class BankingOperations {
    public double withdraw(double currentBalance, double withdrawAmt) throws InsufficientBalanceException {
        if(currentBalance < withdrawAmt) {
            InsufficientBalanceException ISBex = new InsufficientBalanceException();
            throw ISBex;
        }
        else {
            currentBalance -= withdrawAmt;
        }

        return currentBalance;
    }
}