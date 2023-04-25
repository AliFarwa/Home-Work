package HW13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false


        Scanner scan=new Scanner(System.in);
        System.out.println("Please write the word:");
        String str= scan.next();
        String newString="";

        String palindrome=str;

        for (int i =str.length()-1; i >=0 ; i--) {
        newString=newString+str.charAt(i);
        }
         if(palindrome.equals(newString)){
             System.out.println("Word is Palindrome");
         }else {
             System.out.println("Word is not Palindrome");
         }





    }
}
