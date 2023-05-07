package Replit;

import com.sun.tools.javac.Main;

public class R130 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
    }

    static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] / 2);
            } else {
                System.out.println(array[i] * 10);
            }

        }

    }
}