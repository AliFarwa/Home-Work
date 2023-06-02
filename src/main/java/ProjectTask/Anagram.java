package ProjectTask;

import java.util.Arrays;

public class Anagram {
    //Check if Two Strings are Anagrams: Given two strings, determine if
//they are anagrams, meaning they contain the same characters in a
//different order. For example, "listen" and "silent" are anagrams
    public static void main(String[] args) {
        String w1= "listen";
        String w2="silent";
        if(anagram(w1,w2)){
            System.out.println(w1 + " and " + w2+ " are anagrams");
        }
        else {
            System.out.println(w1 + " and " + w2+ " are  not anagrams");
        }
    }
        static boolean anagram(String w1, String w2){
        if(w1.length() != w2.length()){
            return false;
        }
        else {
            char c[]=w1.toCharArray();
            char c1[]=w2.toCharArray();
            Arrays.sort(c);
            Arrays.sort(c1);

            if(Arrays.equals(c,c1)) {
                return true;
            }
            else return false;
        }

        }
    }
