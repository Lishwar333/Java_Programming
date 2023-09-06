package Java8_Practice;

import java.util.Arrays;
import java.util.List;


// Given the list of integers, find the first element of the list using Stream functions?
public class Problem4 {
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(12,23,24,34,56,7,8);
		
		ints.stream()
			.findFirst()
			.ifPresent(System.out::print);
		
}
}