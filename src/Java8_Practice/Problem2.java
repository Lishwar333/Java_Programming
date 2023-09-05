package Java8_Practice;

import java.util.Arrays;
import java.util.List;


// Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class Problem2 {
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(10,20,15,13,1,5,7,12, 14);
		
		//Not type conversion using map()
		ints.stream()
			.filter(i -> {
					if(i == 1) {
					return true;
				}else if(i>=10) {
					i = i/10;
					if(i==1) {
						return true;
					}else {
						return false;
					}						
				}else {
					return false;}
			}).forEach(System.out::println);
		System.out.println();
		
		//With type conversion using map()
		
		ints.stream()
        	.map(s -> s + "") // Convert integer to String
        	.filter(s -> s.startsWith("1"))
        	.forEach(System.out::println);
	}
	
}
