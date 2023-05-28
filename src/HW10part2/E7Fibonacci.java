package HW10part2;

public class E7Fibonacci {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of
        //Fibonacci series
        // always start from 0 and 1

        int a = 0;
        int b = 1;
        int c;
       // System.out.print(a +"  "+ b+" " );
        for (int i = 1; i <=10 ; i++) {
            c= a+ b;
            System.out.print(a+" ");
            a = b;
            b = c;


        }
        }
    }

