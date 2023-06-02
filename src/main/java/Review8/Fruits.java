package Review8;

public class Fruits {
    String name;
    String colour;


    Fruits(String name, String colour){
           this.name=name;// this is called initializing
            this.colour=colour;
    }
  public  void eat(){
        System.out.println("We can eat " +name+" of colour "+ colour);
    }
}
class Mango extends Fruits{
int price;
    Mango(String name, String colour, int price) {
        super(name, colour);
        this.price=price;
    }

    protected void grow(String country){
        System.out.println(name+ " grown in "+country);
    }

}
   class Apple extends Fruits{
       Apple(String name, String colour) {
           super(name, colour);
       }

       protected void makeJuice(){
        System.out.println("We can make "+name+ " juice");
    }

}
class babyApple extends Apple{
    babyApple(String name, String colour) {
        super(name, colour);
    }//multilevel
    void print(){
        System.out.println(name+ " is very small");
    }
}
 class SuperMarket{
    public static void main(String[] args) {

        Apple app=new Apple("Gala","Red");
     //   app.name="Gala"; // if we use constructor we do not have to create object like this
       // app.colour="Red";
        app.makeJuice();
        app.eat();

        babyApple baby=new babyApple("baby Gala","pink");
       // baby.name="baby Gala";
       // baby.colour="pink";
        baby.makeJuice();
        baby.eat();
    }

}