package ProjectTask;


public class Reverse {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For
        //example, given the input "Hello", the output should be "olleH".

       StringBuilder str = new StringBuilder("Hello");
      System.out.println(str.reverse());

// 2nd way
        String sen="Hello";
        StringBuilder sb= new StringBuilder(sen);
        sb.reverse();
        sen=sb.toString();
        System.out.println(sen);

    }

}
