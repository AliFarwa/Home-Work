package HomeWork7;

public class Homework4 {
    public static void main(String[] args) {
        //  Print odd numbers between 20 and 50 (2 ways)//
        int i = 20;
        while (i <= 50) {
            if (i % 2 == 1)
                System.out.print(" " + i + " ");
            i++;
        }
        for (i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(" "+i+" ");
            }
        }
    }
}