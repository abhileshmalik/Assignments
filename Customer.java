package assignment1.java2;

import java.util.Scanner;

 public class Customer extends Cashier{
        public static String order;
        public static String name;

        public static void main(String[] args) {
            Scanner s =new Scanner(System.in);
            System.out.println("Enter your name please !");
            name = s.nextLine();
            cust();
        }

        public static void cust() {
            Customer c=new Customer();
            System.out.println("Hello "+name+" !!! Wants a coffee? y/n");
            Scanner sc =new Scanner(System.in);
            order = sc.nextLine();
            if(order.equalsIgnoreCase("y"))
                c.payment();
            else
                System.out.println("Kindly Order something !!! Thank You...");
        }

        void payment(){
            Customer c=new Customer();
            Cashier.add(c.order);
        }
        static void ready(){
            System.out.println("We are happy to serve you, Collect your Order. \n Thank You... :)");
        }


}
