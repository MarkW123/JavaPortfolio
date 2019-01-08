
package SodaCan;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Given the height and diameter of a soda can, the 
 * program calculates the volume and surface area of the soda can
 */



public class SodaCan {

    private double height;
    private double diameter;
    private double radius;
    
    /**
     * Creates SodaCan object and calculates radius
     * @param h height
     * @param d diameter
     */
    public SodaCan(double h, double d)
    {
        height = h;
        diameter = d;
        radius = d /2;
    }
    
    /**
     * Calculates the volume of the SodaCan
     * @return volume
     */
    public double getVolume()
    {
        double volume = Math.PI * (radius * radius) * height;
        return volume;
    }
    
    public double getSurfaceArea()
    {
        double surfaceArea = 2 * Math.PI * radius * height + 
                2 * Math.PI * radius * radius;
        return surfaceArea;
    }

}
