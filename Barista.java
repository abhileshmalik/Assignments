package assignment1.java2;

public class Barista {
    public static void prepration() {
        System.out.println("Please wait until your Order gets ready...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order is ready...");
        Cashier.Q.remove();
        Customer.ready();
    }
}
