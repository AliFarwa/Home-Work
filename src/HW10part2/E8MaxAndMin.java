package HW10part2;

public class E8MaxAndMin {
    //Maximum and minimum number in the array?
    public static void main(String[] args) {
        int[] number = {10,100,20,40};
        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

         else if (number[i] > max){
                max=number[i];
           }
        }
        System.out.println("The Maximum number is" +  max);
        System.out.println("The Minimum number is " + min);
    }
}

