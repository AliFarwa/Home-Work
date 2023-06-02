package Replit;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //Write a Java program to get a number from 
        // the user and print whether it is positive or negative. 
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int numb= scan.nextInt();

        if(numb>=0){
            System.out.println("Positve");
        } else if (numb<=0) {
            System.out.println("Negative");
            
        }
    }
}