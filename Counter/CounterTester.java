package Counter;



/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests counter class
 */


public class CounterTester {

    public static void main(String[] args) {
        
        //Create new counter object
        Counter concert = new Counter(10);
        concert.count();
        concert.count();
        System.out.println(concert.getValue());

    }

}
