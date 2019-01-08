package Car;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A car with fuel efficiency and a certain amount of fuel 
 * in the gas tank.
 */


public class Car {

    private double fuelEfficiency;
    private double fuelLevel;
    private double distance;
    
    
    public Car(double fuelE)
    {
        fuelEfficiency = fuelE;
        fuelLevel = 0;
    }
    
    public void addGas(double fuel)
    {
        fuelLevel = fuelLevel + fuel;
    }
    
    public double getGasInTank()
    {
        return fuelLevel;
    }
            
    public void drive(double distance)
    {
        fuelLevel = fuelLevel - distance/fuelEfficiency;
    }

}
