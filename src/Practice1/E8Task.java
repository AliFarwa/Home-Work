package Practice1;

import java.util.Scanner;

public class E8Task {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Marks");
        int marks= scan.nextInt();
         if(marks>=90){
             System.out.println("This is Good");
         } else if (marks>=60 && marks <=89) {
             System.out.println("This is also Good");
         } else if(marks>= 0 && marks<=59) {
             System.out.println("This is Good as well");
         }else {
             System.out.println("Invalid");
         }
         }


    }

