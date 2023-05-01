package Replit;

public class CarTester {

    public static void main(String[] args) {
        Car car=new Car();
        car.carColor="Black";
        car.carMake="BMW";
        car.carYear=2019;
        car.Colour();
        car.year();
        car.model();


        Car car1=new Car();
        car1.carColor="White";
        car1.carMake="Toyota";
        car1.carYear=2018;
        car1.Colour();
        car1.year();
        car1.model();
    }
}
