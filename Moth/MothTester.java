
package Moth;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests the moth class
 */



public class MothTester {

    public static void main(String[] args) {
        
        Moth dragon = new Moth(4);
        
        dragon.moveToLight(12);
        System.out.println(dragon.getPosition());
        dragon.moveToLight(2);
        System.out.println(dragon.getPosition());

    }

}
