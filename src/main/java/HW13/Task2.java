package HW13;

public class Task2 {
    public static void main(String[] args) {

       // How would you swap  2 strings without a temporary variable?


        String a = "Sunday";
        String b = "Monday";

        System.out.println("Before Swapping A = "+ a);
        System.out.println("Before Swapping B = "+ b);

        System.out.println();

      a= a + b; // a=SundayMonday
      b= a.substring(0,a.length()-b.length()); //b=sunday
      a= a.substring(b.length());
        System.out.println("After Swap a =" + a);
        System.out.println("After Swap b= " + b);

//Another way of Swapping:

    String s1 = "Hello";
    String s2= "World";

    s1=s1+s2;//HelloWorld
    s2= s1.replace(s2,"");// s2= Hello
    s1=s1.replace(s2,""); //s1=World
        System.out.println("Value of S1 =" + s1);
        System.out.println("Valuse of S2 =" + s2);



    }
}
