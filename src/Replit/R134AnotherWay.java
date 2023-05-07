package Replit;

public class R134AnotherWay {
    static int countVowels(String s){
    String word=s.replaceAll("[^aeio]","");
    return word.length();
}
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
