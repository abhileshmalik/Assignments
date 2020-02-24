package assignment1.Java8;

interface Interface3{
    default void showing(){
        System.out.println("This is First Interface ");
    }
}

interface Interface4{
    default void show(){
        System.out.println("This is another Interface");
    }
}

public class q8 implements Interface3, Interface4{

    public static void main(String[] args) {

        q8 obj = new q8();

        obj.showing();
        obj.show();

    }
}
