
package TwoDShape;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Creates two dimensional objects
 */



public class TwoDShape {

private String shapeType;
	
    /**
     * Create two dimensional shape object with shape type attribute
     * @param st shape type
     */
    public TwoDShape(String st){
            shapeType = st;
    }

    /**
     * Create TwoDShape without attributes
     */
    public TwoDShape(){
            shapeType = "Two dimensional shape";
    }

    /**
     * Getter method for shape type
     * @return type of shape
     */
    public String getShapeType(){
            return shapeType;
    }

    /**
     * Setter method for shape type
     * @param stp shape type
     */
    public void setShapeType (String stp){
            shapeType = stp;
    }

}
