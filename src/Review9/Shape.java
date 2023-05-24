package Review9;
interface  Drawabla{
    // we can ONLY public static final variables
    // all methods in interface by default are public
}

public abstract class Shape {
public  String type;
protected  String colour;
Shape(String type, String colour){
       this.type=type;
       this.colour=colour;
   }
   protected void printInfo(){
        System.out.println("We buid " +colour+ " " + type);
    }
    public  abstract  double caluclateArea();

}
class Triangle extends Shape{
int base;
int height;
    Triangle(String type, String colour, int base , int height){
        super(type, colour);
        this.height=height;
        this.base=base;
    }

    @Override
      public double caluclateArea() {
      return  (height*base)/1/2;
    }
    public void print(){
        System.out.println(type+ " of colour " +colour+ " has dimension as " +base+" "+height);
    }
}
class Rectangle extends Shape {
    double length, width;


    Rectangle(String type, String colour, double length, double width) {
        super(type, colour);
        this.width = width;
        this.length = length;

    }

    @Override
    public double caluclateArea() {
        return length * width;

    }
    public void print1(){
        System.out.println(type+ " of colour " +colour+ " has dimension as "  +length+" "+width);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Triangle t=new Triangle("triangle","pink",12,18);
        t.print();
        t.printInfo();
        System.out.println("The area of Triangle is : " + t.caluclateArea());


        Rectangle r= new Rectangle("Rectangular","Red",20.20,40.12);
        r.print1();
        r.printInfo();
        System.out.println("The area of Rectangle is : " +r.caluclateArea());


    }
}
