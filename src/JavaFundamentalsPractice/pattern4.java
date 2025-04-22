package JavaFundamentalsPractice;

import java.util.Scanner;

public class pattern4 {
	
	
	public pattern4() {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		
		n = scan.nextInt();
		
		int np = n*2 - 1;
		int j=0;
		int k=1;
		int l=1;
		
		for(int i=1; i<=n*2-1; i++) {
			
			int b = np/2;
			
			while(j<b) {
				System.out.print(" ");
				j++;
			}
			
			j=0;
			
			if(i==1 || i==n*2-1) {
				System.out.print("*");
				System.out.println();
				np = np-2;
			}
			else {
				System.out.print("*");
				while(l<=k) {
					System.out.print(" ");
					l++;
				}
				System.out.print("*");
				System.out.println();
				l = 1;
				if(i<n) {
					k = k+2;
					np = np-2;
				}else {
					k = k-2;
					np = np+2;
				}
				
			}
			
			
		}
		
		
	}
	
	

}
