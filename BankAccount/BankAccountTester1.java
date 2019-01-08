package BankAccount;


/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests bank account class.
 */

import java.lang.Math;

public class BankAccountTester1 {

    public static void main(String[] args) {
        
        BankAccount myAcc = new BankAccount();
        myAcc.deposit(1000);
        myAcc.withdraw(400);
        myAcc.addInterest(10);
        myAcc.deductMonthlyCharge();
       
        System.out.println("Expected: 660");
        System.out.println(myAcc.getBalance());
        

    }

}
