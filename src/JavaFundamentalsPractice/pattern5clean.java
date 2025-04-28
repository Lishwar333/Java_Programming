package JavaFundamentalsPractice;

import java.util.Scanner;

public class pattern5clean {
	
	
	public pattern5clean() {
		

		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int n = scan.nextInt();

		        for (int i = 1; i <= n; i++) {
		            // Print leading spaces
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }

		            // Print first number
		            System.out.print("1");

		            // Print middle spaces and second number (if i > 1 and i < n)
		            if (i > 1 && i < n) {
		                for (int j = 1; j <= (2 * i - 3); j++) {
		                    System.out.print(" ");
		                }
		                System.out.print(i);
		            }

		            // Print entire row for the last line
		            if (i == n) {
		                for (int j = 2; j <= n; j++) {
		                    System.out.print(" " + j);
		                }
		            }

		            System.out.println();
		        }
		    }
		
			
			
		}
		
	
	