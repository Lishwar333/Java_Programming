package JavaFundamentalsPractice;

public class problem_sum_of_long_numbers {

    public static void main(String args) {


    String input1 = "111";
    String input2 = "234";

 

    int l1 = input1.length();
    int l2 = input2.length();

        if(l1>l2) {
            String t = input1;
            input1 = input2;
            input2 = t;
        }

        input1 = new StringBuilder(input1).reverse().toString();
        input2 = new StringBuilder(input2).reverse().toString();

        l1 = input1.length();
        l2 = input2.length();

        int cap=0;
        int s = 0;
        String sum="";

        for(int i=0; i<l1; i++) {

            s = (int)(input1.charAt(i)-'0') + (int)(input2.charAt(i)-'0') + cap;
            sum = sum + (char)(s%10 + '0');
            cap = s/10;

        }

        for(int j=l1; j<l2; j++) {

            s = (int)(input2.charAt(j) -'0') + cap;
            sum = sum + (char)(s%10 + '0');
            cap = s/10;

        }

        if(cap>0) {
            sum = sum + (char)(cap+'0');
        }

        String result = new StringBuilder(sum).reverse().toString();

        System.out.println(result);

 

}}