package Replit;

public class Person {
    String Name;
    String lastName;
    int age;
    void printInfo(){
        System.out.println(Name+" " +lastName +" " +age );
    }
}

class Employee extends Person{
    int salary;
    void printInfo(){
        System.out.println(Name+" " +lastName+" " +age+" " +salary);
    }
}
class Student extends Employee{
    int grade;
    void printInfo(){
        System.out.println(Name+" " +lastName+" " +age+" " +grade);
    }
}
class Retiree extends Student{
    String seniorActivity;
   void printInfo(){
       System.out.println(Name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
class PersonTester {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.Name="Joe";
        obj.lastName="Smith";
        obj.age=35;
        obj.salary=3500;
        obj.printInfo();

        Student obj1=new Student();
        obj1.Name="Adam";
        obj1.lastName="Smith";
        obj1.age=15;
        obj1.grade=10;
        obj1.printInfo();

        Retiree obj2 =new Retiree();
        obj2.Name="Frank";
        obj2.lastName="Smith";
        obj2.age=15;
        obj2.seniorActivity="tour";
        obj2.printInfo();

    }
}