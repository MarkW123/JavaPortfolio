
package Moth;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A moth flies across a straight line, with a distance 
 * from a fixed origin. 
 */



public class Moth {

    private double distanceFromOrigin;
    private double lightDistance;
    
    public Moth(double initialDistance)
    {
        distanceFromOrigin = initialDistance;
    }

    public void moveToLight(double lightPosition)
    {
        lightDistance = lightPosition;
        distanceFromOrigin = distanceFromOrigin + 
                ((lightPosition-distanceFromOrigin)/2);
    }
    
    public double getPosition()
    {
        return distanceFromOrigin;
    }
}
