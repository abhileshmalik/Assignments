package assignment1.java2;

public class MySingleton {


    private static MySingleton myObj=new MySingleton();


    private MySingleton(){

    }

    public static MySingleton getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... Running Test Method.");
    }

    public static void main(String a[]){
        MySingleton x = getInstance();
        MySingleton y = getInstance();

        x.testMe();
        y.testMe();
    }
}

