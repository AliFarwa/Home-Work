package Replit;

import java.util.Scanner;

public class replit105 {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            word = word.replaceAll("[^a,e,i,o,u,A,E,I,O,U]","");
            System.out.println(word);
        }
    }





