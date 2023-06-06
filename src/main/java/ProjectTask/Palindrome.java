package ProjectTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        //Check if a String is Palindrome: Determine whether a given string is
        //a palindrome, which means it reads the same forwards and
        //backward. For example, "madam" is a palindrome.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please write the word:");
        String str= scan.next();
        String reverse="";

        for (int i =str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Word is Palindrome");
        }else {
            System.out.println("Word is not Palindrome");
        }

    }
}
