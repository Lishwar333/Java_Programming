package JavaFundamentalsPractice;

public class arraySorting {

	public arraySorting() {
		
		int []arr = {21, 3, 5, 2, 52};
		
		System.out.println("Array sorting");
		int n = arr.length;
		int t;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
		
		while(n>=1){
			for(int j=0; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					
				}
				
			}
			n--;
		}
		
		n = arr.length;
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}
