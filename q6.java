package assignment1.threading;

public class q6 implements Runnable{
        //Thread t;
        public void run()
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println(Thread.currentThread().getName()+ " : " + i);
                try
                {
                    Thread.sleep(1000);
                }

                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        }

        public static void main(String[] args) throws Exception {

            Thread t1 = new Thread(new q6());
            t1.start();
            t1.join();
            //t1.join(2000);
            //t1.setName("Abhilesh");

            System.out.println();
            Thread t2 = new Thread(new q6());
            t2.start();
            Thread t3 = new Thread(new q6());
            t3.start();

        }

 }
