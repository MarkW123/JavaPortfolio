
package DataSet;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Computes the sum and average of a sequence of integers
 */



public class DataSet {

    private int total;
    private int count;
    private int sum;
    private double average;
    private int largest;
    private int smallest;
    
    /**
     * Creates DataSet object
     */
    public DataSet()
    {
        sum = 0;
        average = 0;
        count = 0;
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
    }
    
    /**
     * Adds number input to the total, increases count by 1, assigns x 
     * to largest and / or smallest variable.
     * @param x number to be added to total
     */
    public void addValue(int x)
    {
        total += x;
        count++;
        largest = Math.max(largest, x);
        smallest = Math.min(smallest, x);
    }
    
    /**
     * Returns total
     * @return total
     */
    public int getSum()
    {
        return total;
    }
    
    /**
     * Calculates average and resets count to 0.
     * @return average
     */
    public double getAverage()
    {
        average = total / count;
        return average;
    }
    
    /**
     * Returns largest number of sequence
     * @return largest
     */
    public int getLargest()
    {
        return largest;
    }
    
    /**
     * Returns smallest number of sequence
     * @return smallest
     */
    public int getSmallest()
    {
        return smallest;
    }

}
