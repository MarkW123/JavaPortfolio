
package Bug;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests methods of the bug class
 */



public class BugTester {

    public static void main(String[] args) {
        
        Bug ladyBird = new Bug(5);
        
        ladyBird.move();
        ladyBird.move();
        ladyBird.turn();
        ladyBird.move();
        ladyBird.turn();
        ladyBird.move();
        System.out.println(ladyBird.getPosition());

    }

}
