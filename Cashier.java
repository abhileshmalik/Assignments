package assignment1.java2;

import java.util.LinkedList;
import java.util.Queue;


public class Cashier {

 public static Queue<String> Q=new LinkedList<>();
      static void add(String coffee) {
         Q.add(coffee);
         System.out.println("Order placed !, Your Order no. is : " + Q.size());
        Barista.prepration();
      }

}
