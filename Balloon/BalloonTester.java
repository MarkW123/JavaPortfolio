
package Balloon;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Constructs a balloon, adds 100cm^3 of air, 
 * tests the three methods, adds another 100cm^3 or air and 
 * tests the methods again.
 */



public class BalloonTester {

    public static void main(String[] args) {
        
        Balloon hotAirBalloon = new Balloon();
        hotAirBalloon.addAir(100);
        System.out.println(hotAirBalloon.getVolume());
        System.out.println(hotAirBalloon.getSurfaceArea());
        System.out.println(hotAirBalloon.getRadius());
        hotAirBalloon.addAir(100);
        System.out.println(hotAirBalloon.getVolume());
        System.out.println(hotAirBalloon.getSurfaceArea());
        System.out.println(hotAirBalloon.getRadius());
        
    }

}
