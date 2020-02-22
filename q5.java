package assignment1.threading;

public class q5 {

    public static void main(String[] args) throws InterruptedException {
        threading th = new threading();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    th.abc();
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
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();


    }

}
