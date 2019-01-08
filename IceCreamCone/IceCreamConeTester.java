
package IceCreamCone;

/**
 *
 * author:  Mark Williams
 * date:    2/1/2019
 * program description: Tests IceCreamConeClass
 */



public class IceCreamConeTester {

    public static void main(String[] args) {
        
        //create new cone object
        IceCreamCone cornetto = new IceCreamCone(5, 6);
        
        //print surface area
        System.out.println(cornetto.getSurfaceArea());

    }

}
