package assignment1.Collections;

import java.util.HashSet;

public class q2 {

    static void countCharacter(String str)
    {
        String lower = str.toLowerCase();
        char charArray[] = lower.toCharArray();

        HashSet<Character> hashSet = new HashSet<>();

        for(int i =0;i<charArray.length; i++)
        {
            hashSet.add(charArray[i]);
        }
        System.out.println("Number of unique characters in Abhilesh Malik : "+hashSet.size());
    }

    public static void main(String[] args) {
        String myString = "Abhilesh Malik";
        countCharacter(myString);

    }
}
