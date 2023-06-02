package Homework10;

public class Hw2DArrays4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
        int[][] matrix = {
                {2, 4, 6, 8},//0 index
                {3, 5, 9, 11},// 1 index
                {6, 5, 7, 8, 10} //2 in
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0)
                    System.out.print(matrix[i][j] + " ");
            }
        }


    }
}