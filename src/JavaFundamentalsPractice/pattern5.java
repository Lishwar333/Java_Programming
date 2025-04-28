package JavaFundamentalsPractice;

import java.util.Scanner;

public class pattern5 {
	
	
	public pattern5() {
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		
		n = scan.nextInt();
		
		int np = n*2 -1;
		int sl;
		int bl =1;
		
		int p=2,m=1;
		int k=1;
		
		for(int i=1; i<=n; i++) {
			
			sl = np/2;
			
			
			for(int j=1; j<=sl; j++) {
				
				System.out.print(" ");
			}
				
				if(i==1 || i==n) {
					if(i==1) {
					
						System.out.print(""+1);
						System.out.println();
					}
					else if(i==n) {
						System.out.print("1");
						while(p <=n) {
							System.out.print(" "+p);					
							p++;
							
						}
						System.out.print(" ");
					}
					
				}else {
					System.out.print(""+1);
					while(k<=bl) {
						System.out.print(" ");
						k++;
					}
					System.out.print(""+i);
					System.out.println();
					bl = bl+2;
				}
				
			
			np = np-2;
			k=1;
			
		}
			
			
		}
		
		
	}
	