package assignment1.threading;

import java.util.Scanner;

public class threading {

        public void abc() throws InterruptedException {
            System.out.println("Before synchronized block of abc");

            synchronized (this){
                System.out.println("Method abc in execution ..... ");
                wait();
                System.out.println("abc in execution again");

            }
        }

        public void xyz() throws InterruptedException {

            System.out.println("Before synchronized block of xyz");
            Scanner sc = new Scanner(System.in);
            Thread.sleep(2000);



            synchronized (this) {
                System.out.println("Waiting for user to hit enter key");
                sc.nextLine();
                System.out.println("Enter key pressed");
                notify();
            }

        }

}
