package HW10part2;

public class E5SwapArrays {
    public static void main(String[] args) {
        /*Write a program to swap 2 numbers without a
temporary variable?
         */

        int x = 20;
        int y = 2;
        x = x + y; //20+2=22
        y = x - y; //22-2=20 (y)
        x = x - y;//22-20=2(x)
        System.out.println("After swapping:" + " x = " + x + ", y = " + y);

        System.out.println();

        int a=2;
        int b=4;

        a=a*b;//8
        b=a/b; //8/4=2
        a=a/b; // 8/2=4

        System.out.println("After swapping:" + " a = " + a + ", b = " + b);

        }
        }

