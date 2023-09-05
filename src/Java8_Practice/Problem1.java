package Java8_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, find out all the even numbers that exist in the list 
// using Stream functions?

public class Problem1 {
	
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		
		for(int i=0;i<10;i++)
		ints.add(i);
		
		List<Integer> even = ints.stream()
								.filter( i -> i%2 == 0)
								.collect(Collectors.toList());
		
		System.out.println(even);
	}
	
}
