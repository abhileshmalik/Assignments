package assignment1.threading;

import java.util.Scanner;

class threading1 {

    public void abc() throws InterruptedException {
        System.out.println("Before synchronized block of abc");

        synchronized (this){
            System.out.println("Method abc in execution ..... ");
            wait();
            System.out.println("abc in execution again");
            notify();
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
            System.out.println("Deadlock");
            wait();
        }

    }

}


public class q10 {

    public static void main(String[] args) throws InterruptedException {
        threading1 th = new threading1();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    th.abc();
                    th.xyz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    th.xyz();
                    th.abc();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();


    }

}
