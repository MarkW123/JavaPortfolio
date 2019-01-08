package CashRegister;
 
/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: Constructs new register object, calculates purchases, 
 * receives payment and prints expected change and actual change 
 */


public class CashRegisterTester {

    public static void main(String[] args) {
        
        //Create cash register object
        CashRegister register = new CashRegister();
        
        //Purchases and payment
        register.recordPurchase(20.37);
        //Print number of items purchased
        System.out.println(register.getItemCount());
        register.enterDollars(20);
        register.enterQuarters(2);
        //Print change
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 0.13");
        
        
        
        
    }

}
