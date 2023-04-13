package Review2;

public class NestedIf {
    public static void main(String[] args) {
        // nested if is if inside if
//first if is call outer if rest are called nested
        boolean DL = true;
        boolean car = true;

        if (DL) {
            System.out.println("Lets check if you have a car");
            if (car) {
                System.out.println("You can drive to work");

            } else {
                System.out.println("You will need to take a bus or uber");
            }
        }
    }
}