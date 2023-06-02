package HW26;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object. Print each object details.
    private String name;
    private String lastName;
    private int age;
    private int salary;

   public Person(String name, String lastName , int age, int salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class Persontester{
    public static void main(String[] args) {
     Person p1=(new Person("Meghan","John",25,2500));
     Person p2=(new Person("Chelsea","James",30,3000));
     Person p3=(new Person("Anthony","Matt",35,1500));

        Map<Integer, Person> person= new TreeMap<>();
        person.put(3,p1);
        person.put(2,p2);
        person.put(1,p3);
        for (var p : person.entrySet()) {
            int personid=p.getKey();
            System.out.println("Person ID: " + personid);
            System.out.println(p.getValue());




        }
    }
}