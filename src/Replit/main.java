package Replit;

public class main {

    String name;
    int rollNO;

    void name() {
        System.out.println("Name is John");
    }

    void rollNO() {
        System.out.println("Roll no is 2");
    }

    public static void main(String[] args) {

        main Student = new main();
        Student.name = "John";
        Student.rollNO = 2;

        System.out.println("Name is " + Student.name + " and " + "roll number is " + Student.rollNO);

    // Student.name();
//
    }

}
