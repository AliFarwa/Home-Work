package HW13;

public class task4 {
    public static void main(String[] args) {
        // To Reverse word by word
        String sentence = "I LOVE JAVA";
        StringBuilder sentence2 = new StringBuilder(sentence);
        sentence2.reverse();
        sentence = sentence2.toString();
        System.out.println(sentence);
    }
}
