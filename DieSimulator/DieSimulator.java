package DieSimulator;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: Simulates the cast of a die. It generates a random 
 * number between 0 and 5.
 */

import java.util.Random;

public class DieSimulator {

    public static void main(String[] args) {
        
        Random num = new Random();
        System.out.println(num.nextInt(6));

    }

}
