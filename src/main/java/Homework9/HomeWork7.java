package Homework9;

public class HomeWork7 {
    public static void main(String[] args) {
        // From an array of integer elements find the largest number.
        int[] numbers = {30, 40, 50, 90};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];}
        }System.out.println(max);
    }
}