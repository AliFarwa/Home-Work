package HW19;

public class Addition {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void add(int num, int num2){

        System.out.println(num+num2);
    }
    static void add(long num,int num1){

        System.out.println(num+num1);
    }
    static void add(double num , int num1){

        System.out.println(num+num1);
    }

    public static void main(String[] args) {
        add(2,5);
        add(222654l,5);
        add(22.50,5);
    }

}
