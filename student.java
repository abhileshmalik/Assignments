package assignment1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {
    String Fname;
    String Lname;
    int age;
    Double score;

    public student(String Fname, String Lname, int age, Double score) {

        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.score = score;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getFname() {
        return Fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getLname() {
        return Lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return Fname + Lname + " - " + age + " = " + score;
    }
}