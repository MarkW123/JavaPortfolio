package Rectangle;

/**
 *
 * author:  Mark Williams
 * date:    November 2018
 * program description: Rectangle class with coordinates of top-left corner
 * and width and height. Method to calculate area.
 */


public class Rectangle {

    //instance variables
    private int width;
    private int height;
    
    /**
     * Constructs a rectangle
     * @param x top left x coordinate
     * @param y top left y coordinate
     * @param w width
     * @param h height
     */
    public Rectangle(int x, int y, int w, int h)
    {
        width = w;
        height = h;
    }

    /**
     * Calculates area of rectangle
     * @return the area
    */
    public double getArea()
    {
        int area = width * height;
        return area;
    }
    
}
