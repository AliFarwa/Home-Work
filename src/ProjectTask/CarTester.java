package ProjectTask;

 class Car {

    double carPrice;
    String carColor;

    public Car(double carPrice , String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }

    double calculateSalePrice(){
       return carPrice;
    }
}
class Sedan extends Car {

    int length;

    public Sedan(double carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        double fiveDiscount = (carPrice / 100 * 5);
        double tenDiscount = (carPrice / 100 * 10);
        if (length > 20) {
            return fiveDiscount;
        } else {
            return tenDiscount;
        }

    }
}
class Truck extends Car {

    double weight;

    public Truck(int carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        double twentyDiscount = (carPrice / 100 * 20);
        double tenDiscount = (carPrice / 100 * 10);

        if (weight > 2000) {
            return tenDiscount;
        } else {
            return twentyDiscount;
        }

    }
}
public class CarTester {
    public static void main(String[] args) {

        Sedan s= new Sedan(2500.0,"Black", 25);
        System.out.println(" The Sales price of Sedan is $" +s.calculateSalePrice()+ " The color is : "+ s.carColor);

        Truck t= new Truck(1000,"Blue", 250.6);
        System.out.println(" The Sales price of Truck is $" + t.calculateSalePrice()+" The color is : " + s.carColor );

    }
}