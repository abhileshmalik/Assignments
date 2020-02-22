package assignment1.threading;

import java.util.Scanner;

class Ques1 extends Thread {

    private volatile boolean running = true;

    public void run() {

        while(running) {
            System.out.println("Running.....");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void exit() {
        running = false;
    }
}

class Main {

    public static void main(String[] args) {
        Ques1 q1 = new Ques1();
        System.out.println("Press enter to stop the execution .");
        q1.start();

        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        q1.exit();
    }

}
