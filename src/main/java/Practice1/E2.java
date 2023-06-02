package Practice1;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        //Check if number is odd or even

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int numb= scan.nextInt();

        if(numb %2==0){
            System.out.println("Number is even ");

        }else {
            System.out.println("Number is odd");
        }



    }
}
