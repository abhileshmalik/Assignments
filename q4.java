package assignment1.Java8;

interface emp1{
    employee get_details(String name, int age, String city);
}

class employee{

    String name;
    int age;
    String city;

    employee(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("City = "+city);
    }
}

public class q4 {

    public static void main(String[] args) {
        emp1 obj = employee::new;
        employee o1 = obj.get_details("Abhilesh Malik", 23, "New Delhi");
        o1.display();
    }
}
