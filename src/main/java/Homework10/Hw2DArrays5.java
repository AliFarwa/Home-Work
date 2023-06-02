package Homework10;

public class Hw2DArrays5 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored.
        String[][] matrix = {
                {"America", "Canada"},
                {"Brazil", "Coloumbia"},
                {"Germany", "Italy"},
                {"Pakistan", "India"},
                {"Africa", "kenya"},
        };
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i <matrix.length; i++) {
            sum = sum + matrix[i].length;
        }
        System.out.println(sum);
        }
}