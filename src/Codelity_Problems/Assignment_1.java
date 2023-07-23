package Codelity_Problems;

import java.util.HashMap;

public class Assignment_1 {
	
	public static int maxDiff(int[] A) {
		HashMap<Integer,Integer> hm = new HashMap();
		int result = 0;
		for(int i = 0; i< A.length; i++){
		if(hm.containsKey(A[i])){
		result = Math.max(result,i - hm.get(A[i]));
		} else {
		hm.put(A[i], i);
		}
		}
		return result;
		}


	public static void main(String[] args) {
		

	}

}
