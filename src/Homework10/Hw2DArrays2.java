package Homework10;

public class Hw2DArrays2 {
    public static void main(String[] args) {
//Using 2D array create a grocery list.
//Inside you should have an array of veggies, fruits, dairy and sweets.
// Retrieve all values from that array using 2 different loops

        String[][] matrix = {
                {"pepper", "onion", "potato"},
                {"apple", "banana", "kiwi"},
                {"milk", "yogurt", "cheese"},
                {"choclates", "cake", "icecream"},
        };
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}