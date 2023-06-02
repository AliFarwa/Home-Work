package Practice1;

public class Reverse {
    public static void main(String[] args) {
        String sentence="Hello, world! I . . ! ? am counting the words in this sentence";
        String [] count=sentence.split("[\\p{Punct}\\s]+");
        System.out.println(count.length);

    }
}
