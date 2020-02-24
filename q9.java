package assignment1.Java8;

import java.util.Arrays;

public class q9 {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(e->e%2==0)
                .forEach(System.out::println);

    }
}
