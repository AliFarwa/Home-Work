package Practice1;

import Replit.main;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}