package assignment1.java2;

public class q3 {

        public static void main(String args[]) {
            try
            {
                Class.forName("abc");
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
}
