
package Rectangle;

import rectangle;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Creates new rectangle objects, assigns values, prints
 * the values of length, width and color of new objects, overwrite the values 
 * of the variables.
 */



public class TestShapes {

    public static void main(String[] args) {
	
	rectangle myShape;
	
	rectangle cube;
	
        //create rectangle objects
	
	myShape = new rectangle (1, 2, "blue"); 
	
	cube = new rectangle (2, 4, "pink"); 
	
	
	// myShape

	double len = myShape.getLength(); // use getLength to access length	
	
	System.out.println("The length of myShape is " + len);
	
	double wid = myShape.getWidth(); // use getWidth to access width	
	
	System.out.println("The width of myShape is " + wid);
	
	String col = myShape.getColor();  // use setColor to overwrite color
	
	System.out.println("The color of myShape is now: " + col);
	
	
	// cube
	
	double len1 = cube.getLength(); // use getLength to access length	
	
	System.out.println("The length of cube is " + len1);
	
	double wid1 = cube.getWidth(); // use getWidth to access width	
	
	System.out.println("The width of cube is " + wid1);
	
	String col1 = cube.getColor();  // use getColor to access new value of color
	
	System.out.println("The color of cube is now: " + col1);
	
	
	// myShape
	
	myShape.setLength(4);

	double len2 = myShape.getLength(); // use setLength to overwrite length	
	
	System.out.println("The new length of myShape is " + len2);
	
	myShape.setWidth(8);
	
	double wid2 = myShape.getWidth(); // use setWidth to overwrite width	
	
	System.out.println("The new width of myShape is " + wid2);
	
	myShape.setColor("green");  // use setBreed to overwrite color
	
	String col2 = myShape.getColor();  // use getBreed to access new value of breed
	
	System.out.println("The new color of myShape is now: " + col2);
	
	double result = myShape.calculateArea(len2, wid2);
	System.out.println("The area of myShape is: " + result);
	
	double result1 = myShape.calculatePerimeter(len2, wid2);
	System.out.println("The perimeter of myShape is: " + result1);
	
	double result2 = cube.calculateArea(len1, wid1);
	System.out.println("The area of cube is: " + result2);
	
	double result3 = cube.calculatePerimeter(len1, wid1);
	System.out.println("The perimeter of cube is: " + result3);
	
	
		
	}

}

