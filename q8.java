package assignment1.java2;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
            String words;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the words:");
            while(true){
                words=sc.nextLine();
                if(words.equalsIgnoreCase("done"))
                    break;
                else{
                    String[] arr = words.split("");
                    if (arr[0].equalsIgnoreCase(arr[arr.length - 1]))
                        System.out.println("First and last char of " + words + " is matched.");
                    else
                        System.out.println("First and last char of " + words + " is not matched.");
                }
            }
            withdowhile();
        }
        static void withdowhile(){
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Enter words again for do while loop...");
            Scanner s1 = new Scanner(System.in);
            String words1;
            do {
                words1 = s1.nextLine();
                if (words1.equalsIgnoreCase("done"))
                    break;
                else {
                    String[] arr = words1.split("");
                    if (arr[0].equalsIgnoreCase(arr[arr.length - 1]))
                        System.out.println("First and last char of " + words1 + " is matched.");
                    else
                        System.out.println("First and last char of " + words1 + " is not matched.");
                }
            }
            while (true);
    }
}
