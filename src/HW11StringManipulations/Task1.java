package HW11StringManipulations;

public class Task1 {
    public static void main(String[] args) {

        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        //For Example String str=hello =>l

        String str="hello";
        for (int i = 0; i <str.length() ; i++)
        if(!str.isEmpty() && i %2!=0 && i <=3) {
            int len = str.length();
            int middle = len / 2;
            System.out.println(str.charAt(middle));


        }


    }

}
