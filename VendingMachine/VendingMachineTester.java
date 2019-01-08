
package VendingMachine;

import VendingMachine.VendingMachine;

/**
 *
 * author:  Mark Williams
 * date:    3/1/2019
 * program description: Money is inserted into the vending machine, and 
 * FirstClass and penny stamps are given in return.
 */



public class VendingMachineTester {

    public static void main(String[] args) {
        
        VendingMachine oneCentMagenta = new VendingMachine();
        oneCentMagenta.insert(1);
        System.out.println(oneCentMagenta.giveFirstClassStamps());
        System.out.println(oneCentMagenta.givePennyStamps());


    }

}
