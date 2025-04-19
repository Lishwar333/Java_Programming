package JavaFundamentalsPractice;

import java.util.Scanner;


public class javapractivenow {
	
	static {
		System.out.println("Results:");
	}

	public static void main(String []args) {
	
		Author a1 = new Author("Lishwar", 24, "Indien");
		Author a2 = new Author("Gayle", 45, "WestIndien");
		
		Author []auth = {a1, a2};
		
		Book book = new Book("Cricket", 333, auth);
		
		System.out.println("The name of the book is " + book.name + " written by "+ book.auth[0].name + " and " + book.auth[1].name + " and is getting sold at " + book.price);
		
	}
	
}
