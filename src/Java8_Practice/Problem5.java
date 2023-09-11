package Java8_Practice;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the total number of elements 
//present in the list using Stream functions?

public class Problem5 {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,7);
		
		Integer total = (int) ints.stream()
			.count();
		
		System.out.println(total);
			
		
	}
	
}
