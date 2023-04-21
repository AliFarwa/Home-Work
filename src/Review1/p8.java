package Review1;

public class p8 {
    public static void main(String[] args) {
        //Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both

        for (int i = 0; i <=100 ; i++) {
            if(i %3==0 && i %5==0){
                System.out.println("These numbers are dividsible by both = " +i);
            }

        }
    }
}
