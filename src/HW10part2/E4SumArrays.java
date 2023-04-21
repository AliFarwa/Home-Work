package HW10part2;

public class E4SumArrays {
    /*Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.*/

    public static void main(String[] args) {
        int[][] number = {{1, 6, 5},//36 even
                {10, 15, 20}//21
        };
        int evensum = 0;
        int oddsum = 0;
        for (int[] numb : number) {
            for (int i : numb) {
                if (i % 2 == 0) {
                    evensum+=i;
                }
                else if (i % 2 != 0)
                    oddsum+=i;
            }
        }
        System.out.println("The sum of even number is" + evensum);
        System.out.println("The sum of odd number is" + oddsum);
    }
}
