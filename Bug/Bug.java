
package Bug;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A bug that moves across a horizontal line.
 * 
 */

public class Bug {

    private int position;
    private int direction;
    
    /**
     * Constructs bug
     * @param initialPosition starting position on line
     */
    public Bug(int initialPosition)
    {
        position = initialPosition;
        direction = 1;
    }
    
    /**
     * Changes direction bug is moving
     */
    public void turn()
    {
        direction = direction * -1;
    }
    
    /**
     * Moves the bug one position along line
     */
    public void move()
    {
        position = position + direction;
    }
    
    /**
     * Gets position of bug on line
     * @return the position on the line
     */
    public int getPosition()
    {
        return position;
    }

}
