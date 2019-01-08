
package DataSet;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Calls addValue four times and prints expected and 
 * actual results
 */



public class DataSetTester {

    public static void main(String[] args) {
        
        //Create new DataSet object
        DataSet primes = new DataSet();
        
        //Add number to total
        primes.addValue(1);
        //Add number to total
        primes.addValue(3);
        //Add number to total
        primes.addValue(5);
        //Add number to total
        primes.addValue(7);
        
        //Print the sum
        System.out.println("Expected: 16");
        System.out.println(primes.getSum());
        
        //Print the average
        System.out.println("Expected: 4");
        System.out.println(primes.getAverage());
        //Print the largest
        System.out.println(primes.getLargest());
        //Print the smallest
        System.out.println(primes.getSmallest());
    }

}
