package JavaFundamentalsPractice;

import java.util.Scanner;

public class pattern1 {
	
	
	public pattern1() {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		
		n = scan.nextInt();
		
		String s = "";
		
		for(int i = 1; i<=n; i++) {
			s = s + i;
			System.out.println(s);
		}
		
		
	}
	
	

}
