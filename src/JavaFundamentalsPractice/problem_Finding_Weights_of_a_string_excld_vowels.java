package JavaFundamentalsPractice;

public class problem_Finding_Weights_of_a_string_excld_vowels {

    public void voidlike() {

    String inputcmp = "Know Program";

    String input = inputcmp.toLowerCase();
    int length = input.length();
    char letter = ' ';
    int weight = 0;

    for(int i=0;i<length; i++) {

        letter = input.charAt(i);
        if(letter == 'a' || letter =='e' || letter =='i' || letter =='o' || letter =='u') {

            continue;
        }

        if(letter >= 97 && letter <=122) {
            weight = weight + ((int)letter - 96);
        }

    }

    System.out.print(weight);

    }
}
