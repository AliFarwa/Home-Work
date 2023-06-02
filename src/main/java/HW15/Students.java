package HW15;

import Hw14.Student;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String Name;
    int ID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students student1=new Students();
        student1.Name="Halima";
        student1.ID=256;
        student1.numberOfStudents++;

       Students student2=new Students();
        student2.Name="Dania";
        student2.ID=2568;
        student2.numberOfStudents++;


        Students student3=new Students();
        student3.Name="Farwa";
        student3.ID=2569;
        student3.numberOfStudents++;


        System.out.println(Students.numberOfStudents);
    }


}
