package HW28;

import java.util.Scanner;

public class Task2 {
    //Create a method checkUserName that will throw a runtime exception.
    // Method should throw an exception when entered username is less than 5 characters.
    public static void checkUserName(String username){
        if(username.length() < 5){
            throw new RuntimeException("Please enter valid username");
        }else {
            System.out.println("Username is valid");
        }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        String username= scan.next();

        checkUserName(username);
    }
}
