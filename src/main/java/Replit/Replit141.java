package Replit;

public class Replit141 {

    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5000, 100,8000, -3, 6000};
        System.out.println(maxValue(arr)); //should print 22
    }
}

