
package Car;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests car class methods
 */



public class CarTester {

    public static void main(String[] args) {
        
        Car myHybrid = new Car(50); //50 km per litre
        myHybrid.addGas(20); //Tank 20 litres
        myHybrid.drive(100); //Drive 100 kms
        double gasLeft = myHybrid.getGasInTank();
        System.out.println(gasLeft);
        
    }

}
