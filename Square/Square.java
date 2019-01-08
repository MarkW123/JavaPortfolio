
package Square;

/**
 *
 * author:  Mark Williams
 * date:    
 * program description: 
 */



public class Square {

    // private class variables
    private int length;  

    /**
     * Constructs a square object with length
     */
    public Square(){
            length = 1;
    }

    /**
     * Constructs a square object with length attribute
     * @param ln 
     */
    public Square(int ln){
            length = ln;
    }

    /**
     * Getter method for length
     * @return length of square
     */
    public int getLength(){  // 
            return length;
    }

    /**
     * Setter method for length
     * @param n length of square
     */
    public void setLength (int n){
            length = n;
    }

    /**
     * Calculates area of square
     * @param len length of square
     * @return area of square
     */
    public static int calculateArea (int len){  // method for calculating area
            int area = len * 2;
            return area;
    }

    /**
     * Calculates perimeter of square
     * @param l length
     * @return perimeter of square
     */
    public static int calculatePerimeter (int l){  // method for calculating perimeter
            int perimeter = l * 4;
            return perimeter;
    }

}
