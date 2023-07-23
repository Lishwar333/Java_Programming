package Codelity_Problems;

public class EncodeTwoStrings {
	

	public static void main(String[] args) {
		
		//Analysed the splitting pattern done for Example inputs wrt their lengths and found 
		//a relation bet Q, R and length of each parts of various sizes Input strings
		
		String input1 = "Machine";
		String input2= "Learning";
		
		String[] inputs = {input1,input2};
		
		String[][] str = new String[2][3];
		
		int i=0;
		while(i<2) {
			
			System.out.println(i);
			int l=inputs[i].length();
			String input = inputs[i];
			System.out.println(input);
			int q=l/3;
				
			if(l%3==0) {
					
					str[i][0] = input.substring(0, q);
					str[i][1] = input.substring(q, q+q);
					str[i][2] = input.substring(q+q);
					
					System.out.println(str[i][0]);
					System.out.println(str[i][1]);
					System.out.println(str[i][2]);
					
				}else if(l%3==2) {
				
				str[i][0] = input.substring(0, q+1);
				str[i][1] = input.substring(q+1, q+q+1);
				str[i][2] = input.substring(q+q+1);
				
				System.out.println(str[i][0]);
				System.out.println(str[i][1]);
				System.out.println(str[i][2]);
				
			}else if(l%3==1) {
				
				str[i][0] = input.substring(0, q);
				str[i][1] = input.substring(q, q+q+1);
				str[i][2] = input.substring(q+q+1);
				
				System.out.println(str[i][0]);
				System.out.println(str[i][1]);
				System.out.println(str[i][2]);
			}
			
			i++;
		}
		
		String output = str[1][2]+str[0][1]+str[1][1]+str[0][0];
		
		
		System.out.println(output.toUpperCase());
		
}

}
