package assignment1.Java8;

interface Interface1{
    default void show(){
        System.out.println("Hello from Interface 1");
    }
}

interface Interface2{
    default void show(){
        System.out.println("Hello from Interface 2");
    }
}

public class q7 implements Interface1,Interface2{

    @Override
    public void show() {
        Interface1.super.show();
        Interface2.super.show();
    }

    public static void main(String[] args) {

        q7 obj = new q7();
        obj.show();
    }
}
