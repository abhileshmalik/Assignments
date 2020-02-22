package assignment1.threading;

 public class q3 extends Thread {
        @Override
        public synchronized void run() {
            for (int i=0;i<3;i++)
            {
                System.out.println("Hello : "+i);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            q3 q = new q3();
            Thread t1=new Thread(q);
            Thread t2=new Thread(q);

            t1.start();
            t2.start();
        }
 }

