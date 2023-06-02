package Homework10;

import HW16.Task1;

public class Hw2DArrays1 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String[][] matrix = {
                {"american", "german", "korean", "italian"},
        };
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i <= 3; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+" ");

            }

        }
    }
}
