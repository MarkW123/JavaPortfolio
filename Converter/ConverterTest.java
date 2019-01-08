
package Converter;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Converts meters to miles
 */



public class ConverterTest {

    public static void main(String[] args) {
        
        final double MILE_TO_KM = 1.609;
        
        Converter milesToMeters = new Converter(MILE_TO_KM);
        System.out.println(milesToMeters.convertTo(1000));

    }

}
