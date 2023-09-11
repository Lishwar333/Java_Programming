package Java8_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, find the maximum value element present in 
//it using Stream functions?

public class Problem6 {
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(2,34,656,7,34,6);
		
		ints.stream()
			.max(Comparator.comparing(Integer::valueOf))
			.ifPresent(System.out::println);
	}

}
