package BankAccount;

import BankAccount.BankAccount;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: Tests the methods of the bank account class
 */


public class BankAccountTester {

    public static void main(String[] args) {
        
        BankAccount tomsAccount = new BankAccount();
        tomsAccount.deposit(2000);
        tomsAccount.withdraw(500);
        System.out.println(tomsAccount.getBalance());
        System.out.println("Expected: 1500");

    }

}
