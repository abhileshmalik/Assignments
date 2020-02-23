package assignment1.Collections;
import java.util.HashMap;

public class q3 {

        static void characterCount(String str)
        {
            HashMap<Character, Integer> hashMap = new HashMap<>();

            String lower = str.toLowerCase();
            char charArray[] = lower.toCharArray();

            for (char eachCharacter : charArray)
            {
                if(hashMap.containsKey(eachCharacter))
                {
                    hashMap.put(eachCharacter, hashMap.get(eachCharacter)+1);
                }
                else
                {
                    hashMap.put(eachCharacter, 1);
                }
            }

            for (HashMap.Entry entry: hashMap.entrySet())
            {
                System.out.println("Occurrences of each character in Abhilesh Malik: "+entry.getKey()+" = "+entry.getValue());
            }
        }
        public static void main(String[] args) {
            String myString = "Abhilesh Malik";
            characterCount(myString);
        }

}
