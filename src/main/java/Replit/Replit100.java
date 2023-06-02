package Replit;

import java.util.Scanner;

public class Replit100 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        char[] sentence = s.toCharArray();
        for (int i = sentence.length - 1; i >= 0; i--)
            System.out.print(sentence[i]);
    }
}

