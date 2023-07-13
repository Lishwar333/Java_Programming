package Java8_Practice;

import java.util.Optional;

public class Optional_classes {

    static String noname() {

        return "no name";
    }

    public static void main(String[] args) {

        String name = " Lishwar K ";
        Optional<String> optional1 = Optional.ofNullable(name);

        //ifPresent

        optional1.ifPresent(n -> System.out.println("My name is "+ n));

        //orElse //get
        String car=null;
        Optional<String> optional2 = Optional.of(Optional.ofNullable(car).orElse(noname()));

        System.out.println(optional2.get());

        //filter()
        //replacing a complete if else statement
        //odd or even problem

        int number = 10;

        Optional<Integer> optional3 = Optional.of(number);

        optional3.filter(n -> n%2==0).ifPresent(n-> System.out.println("The number "+n+" is even"));;

        //map with filter

        Integer number2 = 25;

        Optional<Integer> optional4 = Optional.of(number2);

        optional4
        .filter(n -> n==25)
        .map(Math::sqrt)
        .ifPresent(System.out::println);

    }

}