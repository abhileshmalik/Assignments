package assignment1.Java8;

interface def{
    default void display()
    {
        System.out.println("default method");
    }

    static void show()
    {
        System.out.println("static method");
    }
}

public class q6 implements def{
    public static void main(String[] args) {
        q6 obj = new q6();

        obj.display();
        def.show();

    }

}
