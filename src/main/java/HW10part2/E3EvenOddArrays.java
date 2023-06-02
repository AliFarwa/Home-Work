package HW10part2;

public class E3EvenOddArrays {
//Create a 2D array or integer type where you will store
//odd and even numbers. Develop a program which will
//identify/print the even numbers onl
public static void main(String[] args) {

        int [][] number={{1,6,5},
                {10,15,20}
        };
        for (int[] numb : number) {
            for (int i : numb) {
                if( i %2==0){
                    System.out.println(i);
                }
            }
        }

    }
}
