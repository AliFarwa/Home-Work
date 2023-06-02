package Homework4;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in March, April, May → season =”Spring”
        //if user is born in June, July, August →
        //season =”Summer”  etc …
        //At the end of the program we should see 1 output as “You were born is season __”.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth month");
        String month = scanner.next();

        if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("You were born in season Spring");

        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("You were born in season Summer");
        }
    }
}