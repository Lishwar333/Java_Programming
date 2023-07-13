package Java8_Practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_intefaces {

	 

    public static void main(String[] args) {

        Function<Double, Double> square = (a)-> Math.pow(a, a);
        System.out.println(square.apply((double) 5));

        Consumer<String> name = (s) -> System.out.println("My name is "+s);
        name.accept("Lishwar");

        Supplier<String> time = ()-> "Inside supplier interface";
        System.out.println(time.get());

        Predicate<Integer> size= (a) -> {
            if(a>5) {
                return true;
            }else {
                return false;
            }
        };
        System.out.println(size.test(10));

        //Similarly BiFunctional interfaces can also be used

    }
}