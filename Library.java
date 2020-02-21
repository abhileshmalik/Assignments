package assignment1.java2;

public class Library extends Person {

    public static void main(String[] args) {
        Person p1=new Person();

        p1.Name="Abhilesh Malik";

        System.out.println("Student Name :"+p1.Name+"\nBook_name: "+p1.bookName("Roads to Wander")+"\nAuthor Name: "+p1.authorName("John Michael Green "));
        System.out.println("Issued on : "+p1.issue_on("10-feb-2020")+" till "+p1.issue_till("7")+" days.");
    }
}
