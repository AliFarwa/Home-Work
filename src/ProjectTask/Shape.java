package ProjectTask;

public interface Shape {
    double calculateArea(double area);
    double  calculatePerimeter(double perimeter);


}
class Circle implements Shape{

    @Override
    public double calculateArea(double radius) {
        return radius*2;
    }

    @Override
    public double calculatePerimeter( double perimeter) {
        return perimeter*4;
    }
}
class Square implements Shape{

    @Override
    public double calculateArea(double radius) {
        return radius*2;
    }

    @Override
    public double calculatePerimeter( double perimeter) {
        return perimeter*4;
    }
}
class Calculate{
    public static void main(String[] args) {
        Circle c= new Circle();
        System.out.println("The area of circle is :" + c.calculateArea(20));
        System.out.println("The perimeter of circle is :" + c.calculatePerimeter(10));

        Square s= new Square();
        System.out.println("The area of square is : " + s.calculateArea(10));
        System.out.println("The Perimiter of square is : " +s.calculatePerimeter(25));
    }
}