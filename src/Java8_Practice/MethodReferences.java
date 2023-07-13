package Java8_Practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

public static void main(String[] args) {

    //Static method of math
        Function<Integer, Double> squareroot = Math::sqrt;
        System.out.println(squareroot.apply(25));

    //Static method of math System.out
        Consumer<String> name1 = System.out::println;
        name1.accept("Lishwar");

    //the below has more than just referring a method, so can't use method reference here
        Supplier<String> time = ()-> "Inside supplier interface";
        System.out.println(time.get());
    }
 
}