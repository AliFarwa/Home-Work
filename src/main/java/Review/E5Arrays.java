package Review;

public class E5Arrays {
    public static void main(String[] args) {
        String[] planets={"Earth", "Mars","Jupiter","Saturn","Neptune"};
        for (int i = 0; i < planets.length; i++) {
            System.out.print(planets[i]+" ");

        }
        System.out.println();
     //  System.out.println(planets[0]);
     //   System.out.println(planets[1]);
    //    System.out.println(planets[2]);
        for (String planet : planets) {
            System.out.print(planet+" ");

        }


    }
}
