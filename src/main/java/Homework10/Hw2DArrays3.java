package Homework10;

public class Hw2DArrays3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] matrix = {
                {10, 10, 10},
                {20, 20, 20},
                {30, 30, 30}
        };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }
        }
                    System.out.println(sum);
    }
    }