package Review1;

public class p11 {
    public static void main(String[] args) {
//Write a program to swap 2 numbers without using the 3rd (temporary) variable?
        int a=20;
        int b=10;//20

        a= a+b;//20+10=30
        b=a-b;//30-10=20
        a= a-b;

        System.out.println("swap values for a = " + a);
        System.out.println("swap values for b = " + b);

        int x=2;
        int y=4;

        x= x*y;// x=8
        y= x/y; // y=2
        x=x/y;//4
    }
        }
