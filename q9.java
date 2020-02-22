package assignment1.threading;
import java.util.concurrent.CountDownLatch;

public class q9 extends Thread{

        CountDownLatch count;
        q9(CountDownLatch count){
            this.count=count;
        }
        @Override
        public void run(){
            System.out.println("Starting...");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            count.countDown();
        }
        public static void main(String[] args) throws InterruptedException {
            CountDownLatch count = new CountDownLatch(2);
            q9 t=new q9(count);
            Thread t1=new Thread(t);
            Thread t2=new Thread(t);
            t1.start();
            t2.start();
            count.await();
        }

}
