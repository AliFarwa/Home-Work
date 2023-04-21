package Review3;

public class TwoDArray {
    public static void main(String[] args) {

        String[][] cars = {
                {"Ford", "Lincoln", "Dodge"},
                {"BMW", "Audi", "Mercedes", "VM", "Fiat"},
                {" Honda", "Toyota", "Subaru", "Kia"},
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
        System.out.println();
//iter way
        for (String[] types : cars) {
            for (String type : types) {
                System.out.print(type + " ");
            }
        }
    }
}





