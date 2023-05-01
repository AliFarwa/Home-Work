package Replit;

import java.util.Scanner;

public class Replit98 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] strArray = new String[5];

        for (int i = 0; i < strArray.length ; i++)
            System.out.println("Please enter the name : ");
            String name = scan.next();
            for (int j = 1; j < 5; j++) {
                System.out.println(strArray[j].substring(0,3));
            }
        }
    }
