package HW19;

public class calculateArea {
    static void  Area (double a, double b) {
        double rectangleArea=a*b;
        System.out.println("The area of rectangle = "+rectangleArea);
    }
    static void Area(int e,int f){
        int squareArea=e*f;//side * side
        System.out.println("The area of square = " + squareArea);
    }
}
class calculateAreaTester {
    public static void main(String[] args) {
        calculateArea.Area(10,10);
        calculateArea.Area(5,5);



    }
}