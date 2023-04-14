package Review;

public class E2NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // if the outer false, inner never prints.
            System.out.print(i+" ");

            for(int j=0; j<=1; j++){

                System.out.print(j+" ");// inner loop always depends on outer loop
            }
        }
    }
}