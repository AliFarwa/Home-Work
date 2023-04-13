package Homework9;

public class Homework2 {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
        String[] names = {"Farwa", "Lais", "Halima"};
        for (int i = 0; i < names.length; i++)
            if (i == 0) {
                System.out.println(names[i]);
            }

        String[] namesNew = new String[5];
        namesNew[0] = "Farwa";
        namesNew[1] = "Lais";
        namesNew[2] = "Halima";
        System.out.println(namesNew[0]);

    }
}