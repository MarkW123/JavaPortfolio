package SavingsAccount;

/**
 * author:  Mark Williams
 * date:    December 2018
 * program description: Savings account with interest variable.
 */

public class SavingsAccount {

    private double balance;
    private final double interest;
    
    public SavingsAccount(double bal, double intt)
    {
        balance = bal;
        interest = intt;
    }
    
    public void addInterest()
    {
        balance = balance * (1 + interest/100);
    }
    
    public double getBalance()
    {
        return balance;
    }

}
