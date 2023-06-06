package HW28;

import java.util.Scanner;

public class Task1 {
    // Create a method to check age eligibility that will throw a runtime exception.
    // Method should throw an exception age is less than 16.

    public static void checkAgeEligiblity ( int age){
        if(age < 16){
            throw new RuntimeException("You are less then 18");
        }else {
            System.out.println("You are good");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        checkAgeEligiblity(age);

        }
    }
