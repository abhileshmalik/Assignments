package assignment1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ScoreAndFirstNameComparator implements Comparator<student> {
    public int compare(student s1, student s2)
    {
        if(s1.score > s2.score)
        {
            return 1;
        }
        else if (s1.score < s2.score)
            return -1;
        else
            return s1.Fname.compareTo(s2.Fname);
    }
}

public class q6 {

    public static void main(String[] args) {

        List<student> stu = new ArrayList<student>();

        stu.add(new student("Abhilesh"," Malik", 23, 93.50));
        stu.add(new student("Shubham"," Jain", 21, 91.50));
        stu.add(new student("Nirbhay"," Khurana", 22, 90.0));
        stu.add(new student("Siddharth"," Bhatia", 23, 95.60));
        stu.add(new student("Sagar"," Dhingra", 24, 87.10));
        stu.add(new student("Sarthak"," Mohanty", 25, 95.60));

        Collections.sort(stu, new ScoreAndFirstNameComparator());

        System.out.println("Students list in Sorted order - ");
        System.out.println();

        for(student person: stu) {
            System.out.println(person);
        }
    }
}
