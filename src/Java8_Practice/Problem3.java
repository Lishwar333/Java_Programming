package Java8_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class Problem3 {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
              .filter(n -> !set.add(n))      // Usually gives true after adding. Here true if not added
              .forEach(System.out::println);
		
	
}
}