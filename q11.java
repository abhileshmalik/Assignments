package assignment1.Java8;

import java.util.Arrays;

public class q11 {

    public static void main(String[] args) {

        System.out.println(
                Arrays.asList(1,2,3,4,5,6)
                .stream().map(e->e*2)
                .mapToInt(e->e)
                .average()
        );

    }
}
