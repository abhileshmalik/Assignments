package assignment1.java2;

    class MyException extends Exception
    {
        private boolean suppressStacktrace = false;


        public MyException(String s1)
        {
            super(s1);
            this.suppressStacktrace = suppressStacktrace;
        }
    }


    public class CusException
    {

        public static void main(String args[])
        {
            try
            {
                throw new MyException("Hey Goodmorning");
            }
            catch (MyException ex)
            {
                System.out.println("Caught Exception");

            }
        }
    }

