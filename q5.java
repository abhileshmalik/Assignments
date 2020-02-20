package assignment1.java2;

public class q5 implements Cloneable {
        int rollno;
        String name;

        q5(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        q5(q5 s){
            System.out.println("Copy constructor called");
            rollno = s.rollno;
            name = s.name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){

            q5 s1=new q5(101,"Abhilesh");
            try{
                q5 s2=(q5)s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }catch(CloneNotSupportedException c){}

             q5 s3 = new q5(s1);

            System.out.println(s3.rollno+" "+s3.name);

        }

}
