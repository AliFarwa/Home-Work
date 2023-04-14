package Review;

public class E1Breakkeyword {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if(i==3)
            break;
            System.out.println(i);
        }

        // break words breaks the loop. Java will stop executing after 2 as the conditions turns false.
    }
}