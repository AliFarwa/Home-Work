package Review2;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter distinct number");

        int number = scanner.nextInt();
        int a = 10;
        int b = 15;
        int c = 20;

        if ( a >= c) {
            if ( a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } else {
            if (b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
    }
}