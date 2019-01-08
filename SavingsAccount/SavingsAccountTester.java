package SavingsAccount;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests SavingsAccount class
 */


public class SavingsAccountTester {

    public static void main(String[] args) {
        
        SavingsAccount dadsAcc = new SavingsAccount(10000, 10);
        dadsAcc.addInterest();
        System.out.println(dadsAcc.getBalance());
    }

}
