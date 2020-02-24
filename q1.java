package assignment1.Java8;

@FunctionalInterface
interface GreaterThan{
    boolean func1(int x,int y);
}
@FunctionalInterface
interface Incrementing{
    int func2(int x);
}
@FunctionalInterface
interface Concatenation{
    String func3(String x, String y);
}
@FunctionalInterface
interface ConversionUpperCase{
    String func4(String x);
}

public class q1 {

    public static void main(String[] args) {

        GreaterThan greaterThan = (x,y) -> x>y;
        boolean result = greaterThan.func1(5,3);
        System.out.println(result);

        Incrementing incrementing = (x) -> x+1;
        System.out.println(incrementing.func2(10));

        Concatenation concatenation = (x, y) -> x+y;
        System.out.println(concatenation.func3("Abhilesh ", "Malik"));

        ConversionUpperCase conversionUpperCase = (x) -> x.toUpperCase();
        System.out.println(conversionUpperCase.func4("abhilesh"));

    }


}
