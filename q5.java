package assignment1.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class q5 {

    public static void main(String[] args) {

        //Consumer
        Consumer consumer=(e)-> System.out.println(e);
        consumer.accept(10);

        //Supplier
        Supplier supplier=()-> 6;
        System.out.println(supplier.get());

        //Function
        Function<Integer,Integer> function=(e)-> e+4;
        System.out.println(function.apply(4));

        //Predicate
        System.out.println();
        Predicate<String> stringPredicate = (e) -> e.startsWith("ap");
        System.out.println(stringPredicate.test("apple"));
        System.out.println(stringPredicate.test("ant"));


    }
}
