package JavaFundamentalsPractice;

import java.util.Scanner;

public class pattern2 {
	
	
	public pattern2() {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		
		n = scan.nextInt();
		
		String s = "";
		for(int i = 1; i<=n; i++) {
		
			int a = n-i;
			while(a-- != 0) {
				System.out.print(" ");
			}
			
			int j=i;
			while(j-- !=0) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	

}
