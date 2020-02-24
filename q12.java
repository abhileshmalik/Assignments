package assignment1.Java8;

import java.util.Arrays;

public class q12 {

    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,3,5,6,7,4,8)
                .stream()
                .filter(e->e%2==0)
                .filter(e->e>3)
                .findFirst()
        );
    }

}
