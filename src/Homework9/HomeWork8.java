package Homework9;

public class HomeWork8 {
    public static void main(String[] args) {
//Create an array to store char values and then print those in reverse order
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}