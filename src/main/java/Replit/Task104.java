package Replit;

import java.util.Scanner;

public class Task104 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String[] strArray = new String[5];

        for (int i = 0; i < strArray.length ; i++) {
            strArray[i]= scan.nextLine();}
            for (int j = 0; j < 5; j++) {
                System.out.println(strArray[j].substring(0,3));
            }
        }
    }
