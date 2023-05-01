package Practice1;

import java.util.Scanner;

public class E6Loops {
    public static void main(String[] args) {
        //Print the tabe of a number input by the user.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please print the table of 2");
        int table= scan.nextInt();
        
        int n=5;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n*i);
            
        }
    }
}
