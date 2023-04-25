package HW11StringManipulations;

public class Task1 {
    public static void main(String[] args) {

        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        //For Example String str=hello =>l

        String str = "Java";//since java has 4 chracters and is even nothing will print.
        if (!str.isBlank() && str.length() % 2 != 0 && str.length() >= 3) {
            int middleIndex = str.length() / 2;
            char middleChar = str.charAt(middleIndex);
            System.out.println(middleChar);

        }

        String str1 = "hello";//since hello has 5 and 5 is odd it will print l
        if (!str1.isBlank() && str1.length() % 2 != 0 && str1.length() >= 3) {
            int middleIndex = str1.length() / 2;
            char middleChar = str1.charAt(middleIndex);
            System.out.println(middleChar);

        }


    }
}
