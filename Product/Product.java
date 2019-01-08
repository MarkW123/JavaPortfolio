
package Product;

/**
 *
 * author:  Mark Williams
 * date:    December 2018
 * program description: A product with a name and a price which can be reduced.
 */



public class Product {

    private final String productName;
    private double productPrice;
    
    
    /**
     * Construct a product
     * @param name product name
     * @param price product price
     */
    public Product(String name, double price)
    {
        productName = name;
        productPrice = price;
    }
    
    /**
     * Gets the name of the product
     * @return The name of the product
     */
    public String getName()
    {
        return productName;
    }
    
    /**
     * Gets the price of the product
     * @return the price
     */
    public double getPrice()
    {
        return productPrice;
    }
    
    /**
     * Reduces the price 
     * @param discount the percentage to be taken off the price
     */
    public void reducePrice()
    {
        productPrice = productPrice - 5;
    }
    
}
