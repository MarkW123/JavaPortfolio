
package Converter;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Converts meters to miles, feet and inches
 */



public class Converter {


    private double total;
    private double conversion;
    private double meters;
    
    /**
     * Constructs a converter that can convert between two units
     * @param aConversionFactor meters to be converted
     */
    public Converter(double aConversionFactor)
    {
        conversion = aConversionFactor;
    }
    
    /**
     * Converts from a source measurement to a target measurement
     * @param fromMeasurement the measurement
     * @return the input value converted to the target unit
     */
    public double convertTo(double fromMeasurement)
    {
        total = fromMeasurement * conversion;
        return total;
    }
    
    /**
     * Converts from a target measurement to a source measurement
     * @param toMeasurement the target measurement
     * @return the value whose conversion is the target measurement
     */
    public double convertFrom(double toMeasurement)
    {
        total = toMeasurement / conversion;
        return total;
    }

}
