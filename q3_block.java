package assignment1.threading;

 public class q3_block extends Thread {
        @Override
        public void run() {

            System.out.println("Before Synchronized block");
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("* " + i + " *");
                }
            }
            System.out.println("After Synchronized block");
            System.out.println();
        }

        public static void main(String[] args) {
            q3_block q = new q3_block();
            Thread t1=new Thread(q);
            Thread t2=new Thread(q);

            t1.start();
            t2.start();
        }
 }
