package BankAccount;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Bank account has a balance that can be changed by 
 * deposits and withdrawals.
 */

import java.lang.Math;

public class BankAccount {

   private double balance;
   private double fee;
   private int transactionCount;
   private int freeTransactionCount;
    
    /**
     * Constructs a bank account with a zero balance
     */
    public BankAccount() 
    {
        balance = 0;
        fee= 10;
        transactionCount = 0;
        freeTransactionCount = 1;
    }
    
    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
        fee = 10;
        transactionCount = 0;
        freeTransactionCount = 1;
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
        transactionCount = transactionCount + 1;
    }
    
    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw.
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
        transactionCount = transactionCount + 1;

    }
    
    /**
     * Adds interest to the balance
     * @param rate the percentage interest
     */
    
    public void addInterest(double rate)
    {
        balance = balance * ( 1 + rate/100);
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    public void deductMonthlyCharge()
    {
        int num = Math.max(transactionCount, freeTransactionCount);
        balance = balance - 
                (num-1)*fee;
        transactionCount = 0;
    }

}
