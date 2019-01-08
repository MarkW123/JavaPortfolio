package CashRegister;


/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: A cash register totals up sales and computes change due 
 */

import java.text.DecimalFormat;

public class CashRegister {
    
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
    private double purchase;
    private double payment;
    private int purchaseCount;
    private double change;
    private int dollarChange;
    private int quarterChange;
    private int dimeChange;
    private int nickelChange;
    private int pennyChange;
    

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
        purchaseCount = 0;
    }
    
    /**
     * Records the purchase of an item
     * @param amount the price of the purchased item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
        purchaseCount += 1;
    }
    
    /**
     * Enters the payment received from the customer
     * @param dollars the number of dollars in the payment
     * @param quarters the number of quarters in the payment
     * @param dimes the number of dimes in the payment
     * @param nickels the number of nickels in the payment
     * @param pennies the number of dollars in the payment
     */
    public void enterPayment(int dollars, int quarters, 
            int dimes, int nickels, int pennies)
    {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
    
    /**
     * Enters the number of dollars received from the customer
     * @param dollars the number of dollars in the payment
     */
    public void enterDollars(int dollars)
    {
        payment = payment + dollars;
    }
    
    /**
     * Enters the number of quarters received from the customer
     * @param quarters the number of quarters in the payment
     */
    public void enterQuarters(int quarters)
    {
        payment = payment + quarters * QUARTER_VALUE;
    }
    
    /**
     * Enters the number of dimes received from the customer
     * @param dimes the number of dimes in the payment
     */
    public void enterDimes(int dimes)
    {
        payment = payment + dimes * DIME_VALUE;
    }
    
    /**
     * Enters the number of nickels received from the customer
     * @param nickels the number of nickels in the payment
     */
    public void enterNickels(int nickels)
    {
        payment = payment + nickels * NICKEL_VALUE;
    }
    
    /**
     * Enters the number of pennies received from the customer
     * @param pennies the number of pennies in the payment
     */
    public void enterPennies(int pennies)
    {
        payment = payment + pennies * PENNY_VALUE;
    }
    
    public int getItemCount()
    {
        return purchaseCount;
    }
    
    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
    */
    public String giveChange()
    {
        change = payment - purchase;
        DecimalFormat df = new DecimalFormat("0.00");
        String changeFormatted = df.format(change);
        purchase = 0;
        payment = 0;
        purchaseCount = 0;
        return changeFormatted;
    }
    
    /**
     * Calculates the amount of dollars to give in change
     * @return dollars
     */
    public int giveDollars()
    {
        change = payment - purchase;
        int dollarChange = (int)(change);
        return dollarChange;
    }
    
    /**
     * Calculates the amount of quarters to give in change
     * @return quarters
     */
    public int giveQuarters()
    {
        double quarters = (change - dollarChange) / 0.25;
        quarterChange = (int)(quarters);
        return quarterChange;
    }
    
    /**
     * Calculates the amount of dimes to give in change
     * @return dimes
     */
    public int giveDimes()
    {
        double dimes = (change - dollarChange - quarterChange) / 0.1;
        dimeChange = (int) (dimes);
        return dimeChange;
    }
    
    /**
     * Calculates the amount of nickels to give in change
     * @return nickels
     */
    public int giveNickels()
    {
        double nickels = (change - dollarChange - quarterChange - dimeChange) 
                / 0.05;
        nickelChange = (int) (nickels);
        return nickelChange;
    }
    
    /**
     * Calculates the amount of pennies to give in change
     * @return pennies
     */
    public int givePennies()
    {
        double pennies = (change - dollarChange - quarterChange - dimeChange - 
                nickelChange) / 0.01;
        pennyChange = (int) pennies;
        return pennyChange;
    }
    
}
