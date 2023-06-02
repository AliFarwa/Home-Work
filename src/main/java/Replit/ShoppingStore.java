package Replit;

public class ShoppingStore {
    String item;
    double price;
    double quantity;


    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    void itemTotalPrice() {
        double totalvalue1 = price * quantity;
        System.out.println(item + " Total Value " + totalvalue1);}
        void values(){
        double blanketvalue=99.98;
        double mattressvalue=439.18;
        double result=blanketvalue+mattressvalue;
        System.out.println("You purchased "+result+ " Today");
    }
    public static void main(String[] args) {
        ShoppingStore obj = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore obj1 = new ShoppingStore("Mattress", 219.59, 2);

        obj.itemTotalPrice();
        obj1.itemTotalPrice();
        obj1.values();

    }
}