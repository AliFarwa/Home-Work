package HomeWork7;

public class Homework3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        int even =20;while (even>=1 && even %2 == 0) {
           System.out.print(" "+even+" ");
          even-=2;

        }for (int a = 20; a>=1; a-=2)
       if(a%2==0){
           System.out.println(a);
        }
    }
}