package Practice1;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int numb1 = scan.nextInt();
        int numb2 = scan.nextInt();

        if (numb1 == numb2) {
            System.out.println("Equal");
        } else if (numb1 > numb2) {
            System.out.println("numb1 is greater");

        } else {
            System.out.println("numb1 is lesser");
        }
    }
}
