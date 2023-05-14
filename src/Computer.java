public class Computer {
    String name;
    int price;
    double memory;

    public Computer(String name, int price, double memory) {
        this.name = name;
        this.price = price;
        this.memory = memory;}

    void printInfo(){
        System.out.println(name+" "+price+" "+memory);
    }

    void battery(){
        System.out.println(" Battery life is good");
    }
    void looks(){
        System.out.println(" is very beautiful");
    }

}
class Apple extends Computer{

    public Apple(String name, int price, double memory) {
        super(name, price, memory);
    }
    @Override
    void battery(){
        System.out.println(" Apple Battery life is awesome");
    }
    @Override
    void looks(){
        System.out.println(" Apple is very sleek");
    }

}
class Lenovo extends Computer{

    public Lenovo(String name, int price, double memory) {
        super(name, price, memory);
    }
    @Override
    void battery(){
        System.out.println(" Lenovo Battery life is okey");
    }
    @Override
    void looks(){
        System.out.println(" Lenovo is very nice");
    }

}
class HP extends Computer{

    public HP(String name, int price, double memory) {
        super(name, price, memory);
    }
    @Override
    void battery(){
        System.out.println(" Hp Battery life is good");
    }
    @Override
    void looks(){
        System.out.println(" HP is very beautiful");
    }


}
class Dell extends Computer{

    public Dell(String name, int price, double memory) {
        super(name, price, memory);
    }
    @Override
    void battery(){
        System.out.println(" Dell Battery life is not good");
    }
    @Override
    void looks(){
        System.out.println(" Dell is very beautiful");
    }
    void voice(){
        System.out.println(" Dell Has high volume level");
    }

}
class ComputerTester {
    public static void main(String[] args) {
        Computer[] comp = {new Apple("Mac", 100, 20.3),
                new Lenovo("Lenovo", 500, 60.2),
                new HP("Hp", 400, 406.8),
                new Dell("Dell", 200, 200.5)};
        for (Computer computer : comp) {
            computer.looks();
            computer.battery();
            computer.printInfo();
            if (computer instanceof Dell) {
                ((Dell) computer).voice();
            }
        }
    }
}