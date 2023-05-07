package Review7;

public class MoreMethods {
    //I want methods that accepts 3Strings, concatenates them and return a new
    //concatenated string.
    public static void main(String[] args) {

    }
    String concatenate(String str1,String str2, String str3){
        return  str1.concat(str2).concat(str3);
// or use append method.
    }
// I want to create a method that will return me the largest numbers
    //from given 2 numbers

   int largest(int num1 , int num2){
        int large;
        if(num1>num2){
            large=num1;
            System.out.println(num1);
        }else {
            large=num2;
            System.out.println(num2);
        }return large;
   }
    }

