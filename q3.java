public class q3 {

    static int count=0;
    static int len;

    public void fun1(String a, int i){

        if (a.charAt(i)=='h'){
            count++;
        }
        if(i<len-1){
            fun1(a,i+1);
        }

    }

    public static void main(String[] args) {

        String a = "hello hi how are you";
        len=a.length();

        q3 obj=new q3();
        obj.fun1(a,0);

        System.out.println(count);
    }

}
