package JavaFundamentalsPractice;

public class problem_Finding_total_no_of_unique_numbers {

    public void practice() {

        int[] arr = new int[] {0,0,0,0,0,0,0,0,0,0};

        int number = 22342;
        Integer numero = new Integer(number);

        //write program here


        String strnum = numero.toString();

        int length = strnum.length();
        char num = ' ';
        int num1=0;
        int unique=0;

        for(int j=0; j<length; j++) {

            num = strnum.charAt(j);
            num1 = Character.getNumericValue(num);

            arr[num1]++;

        }

        for(int i=0; i<length; i++) {

            num = strnum.charAt(i);
            num1 = Character.getNumericValue(num);

            if(arr[num1]==1) {

                unique++;


            }
        }
        System.out.println(unique);
    }

 

}