package assignment1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class q5 {

    public static void main(String[] args) {

        List<employee> emp = new ArrayList<employee>();

        emp.add(new employee("Abhilesh", 23 , 45000.10));
        emp.add(new employee("Nirbhay", 22 , 40000.21));
        emp.add(new employee("Siddharth", 24 , 40000.01));
        emp.add(new employee("Shubham", 21 , 35000.11));
        emp.add(new employee("Sagar", 25 , 33000.33));


        // Sort in order of Salary
        Collections.sort(emp, new Comparator<employee>() {
            public int compare(employee e1, employee e2) {

                if(e1.getSalary() > e2.getSalary()) {
                    return 1;
                }
                else if(e1.getSalary() < e2.getSalary()) {
                    return -1;
                }

                return 0;
            }
        });

        for(employee person: emp) {
            System.out.println(person);
        }



    }

}
