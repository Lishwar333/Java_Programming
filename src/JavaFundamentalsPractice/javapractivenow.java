package JavaFundamentalsPractice;

import java.util.Scanner;

public class javapractivenow {

	public static void main(String []args) {
		
		
		System.out.println("Enter the size of the array");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int []a = new int[n];
		
		System.out.println("Enter the array elemetns. Your size is " + n);
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
			sum = sum + a[i];
		}
		
		System.out.println("The sum is " + sum);
		float average = sum/n; 
		System.out.println("The average is "+ average);
		
		
		
	}
	
}
