
package Dog;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Representation of dog with attributes breed, is or is 
 * not dangerous and age. Methods allow you to get or set the attributes and
 * make the dog bark.
 */



public class Dog {

private String breed;  // private class variables
	
	private boolean isDangerous;
	
	private int age;

        /**
         * Constructs dog object with attributes
         * @param b breed
         * @param i is or is not dangerous
         * @param a age
         */
	public Dog(String b, boolean i, int a){
		breed = b;
		isDangerous = i;
		age = a;
	}
	
        /**
         * Constructs dog object with default attributes
         */
	public Dog(){
		breed = "not available";
		isDangerous = true;
		age = 1;
	}
	
        /**
         * Getter method for breed
         * @return breed of dog
         */
	public String getBreed(){
		return breed;
	}
	
        /**
         * Getter method for isDangerous
         * @return is or is not dangerous
         */
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
        /**
         * Getter method for age
         * @return age of dog
         */
	public int getAge(){
		return age;
	}
	
        /**
         * Setter method for breed
         * @param type breed of dog
         */
	public void setBreed (String type){  // setter method for breed
		breed = type;  // set the class attribute (variable) breed equal to word
	}
	
        /**
         * Setter method for isDangerous
         * @param bool is or is not dangerous
         */
	public void setIsDangerous (boolean bool){
		isDangerous = bool;
	}
	
        /**
         * Setter method for age
         * @param num age of dog
         */
	public void setAge (int num){
		age = num;
	}
	
        /**
         * Print the dog's bark. Woof!
         */
	public void bark (){
		System.out.println("Woof! The dog has barked");
	}

}
