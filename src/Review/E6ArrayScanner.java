package Review;

import java.util.Scanner;

public class E6ArrayScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create an array that stores numbers from a user and
        //then we want to calculate the average of numbers.

        System.out.println("How many integers you want to store");

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number");
            numbers[i] = scanner.nextInt();
        }
    }
}
