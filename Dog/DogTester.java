
package Dog;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Tests the dog class
 */



public class DogTester {

    public static void main(String[] args) {
        
	Dog myPooch;
	
	Dog whiteFang;
	
	Dog patch;
	
/*  create a Dog object using the Dog class constructor and pass reference to the 
	new object to the myPooch variable  */
	
	myPooch = new Dog ("west yorkshire terrier", false, 5); 
	
	whiteFang = new Dog ("wolf", true, 11); 
	
	patch = new Dog ("collie", false, 7); 
	
	// myPooch 

	String description = myPooch.getBreed(); // use getBreed to access breed	
	
	System.out.println("The breed of myPooch is " + description);
	
	myPooch.setBreed("golden retriever");  // use setBreed to overwrite breed
	
	description = myPooch.getBreed();  // use getBreed to access new value of breed
	
	System.out.println("The new breed of myPooch is now: " + description);
	
	myPooch.bark();  // call bark method
	
	// whiteFang
	
	String descr = whiteFang.getBreed(); // use getBreed to access breed	
	
	System.out.println("The breed of whiteFang is " + descr);
	
	whiteFang.setBreed("Irish wolf hound");  // use setBreed to overwrite breed
	
	descr = whiteFang.getBreed();  // use getBreed to access new value of breed
	
	System.out.println("The new breed of whiteFang is now: " + descr);
	
	whiteFang.bark();  // call bark method
	
	// patch
	
	
	String descript = patch.getBreed(); // use getBreed to access breed	
	
	System.out.println("The breed of patch is " + descript);
	
	patch.setBreed("German shepherd");  // use setBreed to overwrite breed
	
	descript = patch.getBreed();  // use getBreed to access new value of breed
	
	System.out.println("The new breed of patch is now: " + descript);
	
	patch.bark();  // call bark method
		
	}

}
