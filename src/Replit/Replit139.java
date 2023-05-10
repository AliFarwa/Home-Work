package Replit;

public class Replit139 {
    public String alphabetical(String str) {
        String result = "";
        char previousChar = 'a';//I am setting an initial value for a char
        for (int i = 0; i < str.length(); i++) {//loop to itterate the char
            char currentChar = str.charAt(i);//whatever the index is place it in curren char
            if (currentChar > previousChar) {//compare if the letter is greater then the previous char
                result += currentChar;//if yes then store the letter in result
                previousChar = currentChar;// stre the current letter in he previous char
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }


}