public class oloading
{
    void add(int a,int b)
    {
        int c;
        c= a + b;
        System.out.println("Integer Addition = "+c);
    }
    void add(double a,double b)
    {
        double c = 0.0;
        c= a + b;
        System.out.println("Double Addition = "+c);
    }
    void mult(float a,float b)
    {
        float c;
        c= a + b;
        System.out.println("Float Multiply = "+c);
    }
    void mult(int a,int b)
    {
        int c;
        c= a + b;
        System.out.println("Integer Multiply = "+c);
    }
    void concat(String a,String b)
    {
        String c;
        c= a + b;
        System.out.println("2 String CONCAT  = "+c);
    }
    void concat(String a,String b,String z)
    {
        String c;
        c= a + b + z;
        System.out.println("3 String CONCAT = "+c);
    }
    public static void main(String args[])
    {
        oloading o=new oloading();
        o.add(3,5);
        o.add(1.2366,3.87387);
        o.mult(3,4);
        o.mult(3.12f,3.21f);
        o.concat("Hello ","Abhilesh ");
        o.concat("Hello ","Abhilesh "," Welcome");
    }
}
