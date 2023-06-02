package Review1;

public class p12 {
    public static void main(String[] args) {
        //Write a program to reverse a number?

        int num = 287;
         int reversed = 0;

        while(num>0){
            reversed=(reversed*10)+ num %10;
            num=num/10;
        }

        System.out.println("Reversed Number: " + reversed);


    }
}
