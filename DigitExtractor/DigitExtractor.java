
package DigitExtractor;

/**
 *
 * author:  Mark Williams
 * date:    3/1/2019
 * program description: Reads in an integer and breaks it into a sequence of 
 * individual digits in revers order.
 */



public class DigitExtractor {
    
    private int inputNumber;

    /**
     * Creates DigitExtractor object
     * @param anInteger the number entered
     */
    public DigitExtractor (int anInteger)
    {
        inputNumber = anInteger;
    }
    
    /**
     * Changes inputNumber to string, gets length of string, accesses last 
     * digit of number and converts back to integer to be returned.
     * @return digit from last to first each time method is called
     */
    public int nextDigit()
    {
        String input = Integer.toString(inputNumber);
        int length = input.length();
        String y = input.substring(length);
        int z = Integer.parseInt(y);
        length--;
        return z;
    }

}
