package HomeWork3;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scanner.nextBoolean();

        if (loan == true) {
            System.out.println("What is your credit score?");}
        else {
            System.out.println("Unknown");}
        int score = scanner.nextInt();
        {if (score <= 600) {
                System.out.println("The eligibility is Not eligible");}
            if (score >= 601 && score <= 700) {
                System.out.println("The eligibility is Maybe eligible");}
            if (score >= 701 && score <= 800) {
                System.out.println("The eligibility is Eligible");
            } else if (score > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }
    }
}