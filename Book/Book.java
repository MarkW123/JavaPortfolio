
package Book;

/**
 *
 * author:  Mark Williams
 * date:    September 2018
 * program description: Records the book title, no. of pages, publishing year 
 * and author. Methods are included to set or get this information.
 */



public class Book{

	private String bookTitle;
	
	private int numPages;
	
	private int pubYear;
	
	private String author;
	
	private String genre;

        /**
         * Constructs a book object and initializes the book info
         * @param bt book title
         * @param np name of publisher
         * @param py publishing year
         * @param a author's name
         * @param g genre
         */
	public Book(String bt, int np, int py, String a, String g){
		bookTitle = bt;
		numPages = np;
		pubYear = py;
		author = a;
		genre = g;
	}
	
        /**
         * Constructs a book object with default information
         */
	public Book(){
		bookTitle = "Undefined";
		numPages = 0;
		pubYear = 1900;
		author = "W.B. Yeats";
		genre = "Undefined";
	}
	
        /**
         * Gets the book title
         * @return the title of the book
         */
	public String getBookTitle(){  // getter methods
		return bookTitle;
	}
	
        /**
         * Gets the number of pages
         * @return the number of pages of the book
         */
	public int getNumPages(){  
		return numPages;
	}
	
        /**
         * Gets the year the book is published
         * @return the publishing year
         */
	public int getPubYear(){  
		return pubYear;
	}
	
        /**
         * Gets the book author
         * @return the author of the book
         */
	public String getAuthor(){  
		return author;
	}
	
        /**
         * Gets the book author
         * @return the author of the book
         */
	public String getGenre(){  
		return genre;
	}
	
        /**
         * Sets the title of the book
         * @param ttl book title
         */
	public void setBookTitle (String ttl){  // setter methods
		bookTitle = ttl;
	}
	
        /**
         * Sets the number of pages
         * @param numP the number of pages of the book
         */
	public void setNumPages (int numP){  
		numPages = numP;
	}
	
        /**
         * Sets the year the book was published
         * @param pubY the publishing year
         */
	public void setPubYear (int pubY){  
		pubYear = pubY;
	}
	
        /**
         * Sets the author of the book
         * @param aut the book author
         */
	public void setAuthor (String aut){  
		author = aut;
	}
	
        /**
         * Sets the genre of the book
         * @param gen the book genre
         */
	public void setGenre (String gen){  
		genre = gen;
	}
	
}
