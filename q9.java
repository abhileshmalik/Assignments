enum houses
{
    h1(15000),
    h2(20000),
    h3(30000),
    h4(50000);

    private int value;

    houses(int value){
        this.value=value;
    }

    public int value(){
        return this.value;
    }
}

public class q9 {

    public static void main(String args[]) {
        houses myhouse = houses.h3;

        switch (myhouse) {
            case h1:
                System.out.println("Price = " + myhouse.value());
                break;
            case h2:
                System.out.println("Price = " + myhouse.value());
                break;
            case h3:
                System.out.println("Price = " + myhouse.value());
                break;
            case h4:
                System.out.println("Price = " + myhouse.value());
                break;
            default:
                System.out.println("Please choose correct house name");
                break;
        }

    }

}

