
package Pair;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Prompts user for two numbers and can calculate the sum
 * difference, product, average, distance, max and min.
 */


public class Pair {

    private double first;
    private double second;
    
    /**
     * Creates object, pair of numbers
     * @param f first number
     * @param s second number
     */
    public Pair(double f, double s)
    {
        first = f;
        second = s;
    }
    
    /**
     * Gets the sum of the two numbers
     * @return the sum
     */
    public double getSum()
    {
        double sum = first + second;
        return sum;
    }
    
    /**
     * Subtracts the second from the first number
     * @return the difference
     */
    public double getDifference()
    {
        double diff = first - second;
        return diff;
    }
    
    /**
     * Multiplies the two numbers
     * @return the product
     */
    public double getProduct()
    {
        double product = first * second;
        return product;
    }
    
    /**
     * Averages the two numbers
     * @return the average
     */
    public double getAverage()
    {
        double average = (first + second) / 2.0;
        return average;
    }
    
    /**
     * Gets the absolute value of the difference between the two numbers
     * @return the distance
     */
    public double getDistance()
    {
        double distance = Math.abs(first - second);
        return distance;
    }
    
    /**
     * Gets the larger of the two numbers
     * @return the max
     */
    public double getMax()
    {
        double max = Math.max(first, second);
        return max;
    }

    /**
     * Gets the smaller of the two numbers
     * @return the min
     */
    public double getMin()
    {
        double min = Math.min(first, second);
        return min;
    }
}
