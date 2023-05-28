package HW25;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Student {

    String name;
    int StudentID;

    Student(String name, int StudentID){
        this. name= name;
        this.StudentID=StudentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentID=" + StudentID +
                '}';
    }

}
class StrudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Megan", 102);
        Student s2 = new Student("Chelsea", 89);
        Student s3 = new Student("Anthony", 40);

        HashSet<Student> arrayList = new HashSet<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }
}

