package Review2;

import java.util.Scanner;

public class replit2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > c && a>b  ) {
            System.out.println("The largest number is"+a);
        }
        else if(b > a && b >c){
            System.out.println("The largest number is"+b);
        }
        else {
            System.out.println("The largest number is"+c);
        }
    }
}

