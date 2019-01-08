
package VendingMachine;

/**
 *
 * author:  Mark Williams
 * date:    3/1/2019
 * program description: A vending machine that takes money and gives out as many
 * first-class or penny stamps the customer pays for.
 */



public class VendingMachine {

    private final double firstClassPrice = 0.44;
    private final double pennyStampPrice = 0.01;
    
    private double payment;
    private int numStamps;
    
    /**
     * Constructs a VendingMachine object
     */
    public VendingMachine()
    {
        
    }
    
    /**
     * Registers payment of money by customer
     * @param dollars the amount of money paid
     */
    public void insert(int dollars)
    {
        payment = dollars;
    }
    
    /**
     * Calculates how many firstClassStamps to give to customer and returns 
     * number
     * @return number of first class stamps
     */
    public int giveFirstClassStamps()
    {
        double num = payment / firstClassPrice;
        numStamps = (int) (num);
        return numStamps;
    }
    
    /**
     * Calculate the remaining change to be give to customer and returns 
     * the number of penny stamps
     * @return  the number of penny stamps
     */
    public int givePennyStamps()
    {
        double change = (payment - (numStamps * firstClassPrice)) 
                / pennyStampPrice;
        int numPennyStamps = (int)(change);
        return numPennyStamps;
    }

}
