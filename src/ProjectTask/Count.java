package ProjectTask;

public class Count {
    public static void main(String[] args) {
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.

        String word = "Hello, world!";
        int count=word.split("\\s").length;// will count whitespaces
            System.out.println(count);
        }
}


