package HomeWork2;

public class DoubleComparison {
    public static void main(String[] args) {
        double number1 = 12.5;
        int number2 = 10;

        if (number1 > number2) {
            System.out.println("Double value is higher then the second");

            double num1 = 15;
            double num2 = 20;
            if (num1 > num2) {
                System.out.println("Double number" + num1 + "is greater then" + num2);
            } else {
                System.out.println("Double number" + num2+"is greater then" + num1);
            }

        }
    }
}
