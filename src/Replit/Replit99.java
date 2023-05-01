package Replit;

import java.util.Locale;
import java.util.Scanner;

public class Replit99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        String newstring="";
        String palindrome=str;

        for (int i = str.length()-1 ; i >=0; i--) {
            newstring=newstring+str.charAt(i);

        }if(palindrome.equalsIgnoreCase(newstring)){
            System.out.println("ture");

        }else {
            System.out.println("false");
        }

    }
}
