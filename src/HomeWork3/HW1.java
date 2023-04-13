package HomeWork3;

import java.util.Scanner;

public class HW1 {
    public static class class1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number");
            int numb = scanner.nextInt();
            if (numb % 2 == 0) {
                System.out.println("Value is Even");

                if (numb > 1000) {
                    System.out.println("Even value is large");
                } else {
                    System.out.println("Even value is just right");
                }
            } else {
                System.out.println("Value is Odd");

                if (numb > 1000) {
                    System.out.println("Odd Value is large");

                } else {
                    System.out.println("odd value is just right ");
                }
            }
        }
    }
}
