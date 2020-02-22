package assignment1.threading;

import java.util.concurrent.*;

public class q7 {
    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<Integer> future=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        executorService.shutdown();
        try{
            System.out.println("Addition of first 5 Integers is = "+future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
