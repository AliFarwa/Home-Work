package Replit;

public class Replit139secondway {
    public static String alphabetical(String str) {
        String newstr="";
        for (int i = 0; i <str.length() ; i++) {
         if(i==0 || str.charAt(i) > str.charAt(i-1)){

             newstr=newstr+str.charAt(i);
         }
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(Replit139secondway.alphabetical("hello"));
        System.out.println(Replit139secondway.alphabetical("software"));
        System.out.println(Replit139secondway.alphabetical("language"));
    }
}
