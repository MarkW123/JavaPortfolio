
package Square;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Tests square class
 */



public class SquareTester {

    public static void main (String [] args){

    //Create new square object
    Square tron = new Square (5);

    //Print length
    System.out.println("The length of the square is " + tron.getLength());
    //Set length
    tron.setLength(6);
    //Print new length
    System.out.println("The new length of the square is " + tron.getLength());

    //Print area
    System.out.println("The area of tron is " + Square.calculateArea(6));
    //Print perimeter
    System.out.println("The perimeter of tron is " + Square.calculatePerimeter(6));

    //Create square array
    Square [] tronArray;
    tronArray = new Square [4];

    //For loop
    for(int i=0; i<4; i++){

            
            int x = 1 + (int)(Math.random()*20);

            tronArray[i] = new Square (x);

            System.out.println("The length of tronArray[" + i + "] is " + x);
    }

    }

}
