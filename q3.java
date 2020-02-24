package assignment1.Java8;

@FunctionalInterface
interface Addition{
    int add1(int x,int y);
}
@FunctionalInterface
interface Subtraction{
    int sub1(int x,int y);
}
@FunctionalInterface
interface Multiplication{
    int mul(int x,int y);
}

public class q3 {

    int add(int x, int y)
    {
        return x+y;
    }

    int sub(int x, int y)
    {
        return x-y;
    }

    static int mult(int x, int y)
    {
        return x*y;
    }

    public static void main(String[] args) {

        Multiplication multiplication = q3::mult;
        System.out.println("Multiplication = " + multiplication.mul(5,6));

        Addition addition = new q3()::add;
        System.out.println("Addition = " + addition.add1(15,25));

        Subtraction subtraction = new q3()::sub;
        System.out.println("Subtraction = " + subtraction.sub1(25,5));

    }
}
