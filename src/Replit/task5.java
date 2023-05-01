package Replit;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //Write a Java program that takes three numbers
        // from the user and prints the greatest number.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int numb= scan.nextInt();
        int firstNumber=15000;
        int secondNumber=100;
        int thirdNumber=15;

        if(firstNumber>secondNumber && firstNumber>thirdNumber) {
            System.out.println("The greatest number is " + firstNumber);
        } else if (secondNumber>thirdNumber && secondNumber>firstNumber) {
            System.out.println("The greatest number is " + secondNumber);
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("The greatest number is " + thirdNumber);

        }
    }
}
