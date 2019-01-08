
package Book;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Create 3 book objects, assigns the values and prints the
 * values of each object
 */



public class BookTester {

    public static void main(String[] args) {
	
	Book kaneAndAbel; // book declarations
	
	Book Dubliners;
	
	Book swordOfShannara;
	
        // book initialisations
	kaneAndAbel = new Book ("Kane and Abel", 512, 1985, "Jeffrey Archer", "Drama"); 
	
	Dubliners = new Book ("Dubliners", 152, 1914, "James Joyce", "Short Story");
	
	swordOfShannara = new Book ("The Sword of Shannara", 726, 1977, "Terry Brooks", "Epic fantasy");
	
	// print statements and use getter methods
	System.out.println("The book title is: " + kaneAndAbel.getBookTitle());  
		
	System.out.println("The number of pages is: " + kaneAndAbel.getNumPages());
		
	System.out.println("The year published is: " + kaneAndAbel.getPubYear());
		
	System.out.println("The author is: " + kaneAndAbel.getAuthor());
		
	System.out.println("The genre is: " + kaneAndAbel.getGenre());
	
	// Dubliners
	
	System.out.println("The book title is: " + Dubliners.getBookTitle());
		
	System.out.println("The number of pages is: " + Dubliners.getNumPages());
		
	System.out.println("The year published is: " + Dubliners.getPubYear());
		
	System.out.println("The author is: " + Dubliners.getAuthor());
		
	System.out.println("The genre is: " + Dubliners.getGenre());
	
	// swordOfShannara
	
	System.out.println("The book title is: " + swordOfShannara.getBookTitle());
		
	System.out.println("The number of pages is: " + swordOfShannara.getNumPages());
		
	System.out.println("The year published is: " + swordOfShannara.getPubYear());
		
	System.out.println("The author is: " + swordOfShannara.getAuthor());
		
	System.out.println("The genre is: " + swordOfShannara.getGenre());
		
    }

}

