package counter;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Counter class that has an initial value and increases
 * by 1 each time the counter method is called
 */


public class Counter {

    private int value;
    
    /**
     * Constructs a counter with an initial value
     * @param initialValue starting count
     */
    public Counter(int initialValue)
    {
        value = initialValue;
    }
    
    /**
     * Adds one to the current value
     */
    public void count()
    {
        value = value + 1;
    }
    
    /**
     * Gets value of count object
     * @return value
     */
    public int getValue()
    {
        return value;
    }

}
