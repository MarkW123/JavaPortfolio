
package IceCreamCone;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: You supply the height and radius of a cone and 
 * the program returns the surface area and volume of a cone.
 */



public class IceCreamCone {

    private double height;
    private double radius;
    
    /**
     * Constructs cone object
     * @param h height of cone
     * @param r radius of cone
     */
    public IceCreamCone(double h, double r)
    {
        height = h;
        radius = r;
    }
    
    public double getSurfaceArea()
    {
        double surfaceArea = Math.PI * radius *
        (radius + Math.sqrt(height * height + radius * radius));
        return surfaceArea;
    }
    
    public double getVolume()
    {
        double volume = Math.PI * radius * radius * (height / 3);
        return volume;
    }

}
