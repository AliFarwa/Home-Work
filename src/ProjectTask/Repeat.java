package ProjectTask;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the word");
        String word= scan.next().toLowerCase();
        for (int i = 0; i <word.length() ; i++) {
            boolean result=true;
            for (int j = 0; j <word.length() ; j++) {
                if(i!=j && word.charAt(i) == word.charAt(j)){
                    result=false;
                }
            }
            if(result){
                System.out.println(word.charAt(i));
                break;
            }
        }
    }
}
