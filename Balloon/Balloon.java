
package Balloon;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Models a spherical balloon that is filled with air.
 * The methods calculate the amount of air, the volume, surface area and radius.
 */



public class Balloon {

private double air;
private double volume;
private double surfaceArea;
private double radius;


public Balloon()
{
    air = 0;
    volume = 0;
    surfaceArea = 0;
    radius = 0;
}

public void addAir(double a)
{
    air += a;
    radius = 3 * (air / Math.cbrt(4 * Math.PI));
}

public double getVolume()
{
    volume = air;
    return volume;
}

public double getSurfaceArea()
{
    surfaceArea = 4 * Math.PI * radius * radius;
    return surfaceArea;
}

public double getRadius()
{
    return radius;
}

}
