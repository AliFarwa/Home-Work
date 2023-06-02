package Homework9;

public class HomeWork1 {
    public static void main(String[] args) {

        /*
        Create an array of chars and store grades into it: A,B,C,D. Then print a grade B
        (use 2 different ways of creating an array).
         */

        char[] letters = {'a', 'b', 'c', 'd'};
        //    System.out.println(letters[1]);

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'b') {
                System.out.println(letters[i]);

                System.out.println();
                char [] letters1= new char[4];
                letters1[0]='a';
                letters1[1]='b';
                letters1[2]='c';
                letters1[3]='d';
                System.out.println(letters1[1]);
            }

        }


    }


}