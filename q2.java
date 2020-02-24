package assignment1.Java8;

interface returning{
    int revert(int x, int y);
}

public class q2 {

    public static void main(String[] args) {

        returning ret = (x,y) -> x;

        System.out.println(ret.revert(22,44));

    }
}
