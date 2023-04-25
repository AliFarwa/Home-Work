package Replit;

public class Dog {

    String name;
    String breed;
    String colour;

    void bark() {
        System.out.println(name+ " can bark");
    }

    void run() {
        System.out.println(name+ " can run");
    }

    void play() {
        System.out.println(name+ " can play");
    }

    public static void main(String[] args) {

        Dog Dog1Object = new Dog();
        Dog1Object.name = "Husky";
        Dog1Object.bark();
        Dog1Object.run();
        Dog1Object.play();

        Dog Dog2Object = new Dog();
        Dog2Object.name = "Bulldog";
        Dog2Object.bark();
        Dog2Object.run();
        Dog2Object.play();


        Dog Dog3Object = new Dog();
        Dog3Object.name = "Labrador";
        Dog3Object.bark();
        Dog3Object.run();
        Dog3Object.play();



    }
}


