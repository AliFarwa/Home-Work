package HW19;

public class Multiplication {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void multiply(int a , int b){
        System.out.println(a*b);
    }
    private void multiply(int a, double b){
        System.out.println(a*b);
    }
    private void multiply(long a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Multiplication obj=new Multiplication();
        obj.multiply(10,10);
        obj.multiply(10,20.5);
        obj.multiply(25645l,25.36);
    }
}

