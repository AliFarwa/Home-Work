package Review6;

public class IceCream {

    String Flavour, colour;
    boolean dairyfree;
    int Price;


    void eat() {
        System.out.println("I eat it");
    }

    void colour() {
        System.out.println("Clour is white");
    }

    void buy() {
        System.out.println(Price + "Ice cream cost");
    }

    public static void main(String[] args) {
         new IceCream();


    }
}