package JavaFundamentalsPractice;

import java.util.Scanner;
import JavaFundamentalsPractice.*;


public class javapractivenow {
	
	static {
		System.out.println("Results:");
	}

	public static void main(String []args) {
	
		Author a1 = new Author("Lishwar", 24, "Indien");
		Author a2 = new Author("Gayle", 45, "WestIndien");
		
		Author []auth = {a1, a2};
		
		Book book = new Book("Cricket", 333, auth);
		
		System.out.println("The name of the book is " + book.getName() + " written by "+ book.auth[0].getName()+ " and " + book.auth[1].getName() + " and is getting sold at " + book.getPrice());
		
		
		
		System.out.println(System.getProperty("user.home"));
		
		pattern4 pat = new pattern4();
	}
	
}
	