
package Product;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: Tests the methods of the product class
 * 
 */



public class ProductPrinter {

    public static void main(String[] args) {
        
        Product toast = new Product("Toaster", 29.95);
        Product cheese = new Product("Camembert", 10);
        
        System.out.println(toast.getName());
        System.out.println(toast.getPrice());
        toast.reducePrice();
        System.out.println(toast.getPrice());
        
        System.out.println(cheese.getName());
        System.out.println(cheese.getPrice());
        cheese.reducePrice();
        System.out.println(cheese.getPrice());

    }

}
