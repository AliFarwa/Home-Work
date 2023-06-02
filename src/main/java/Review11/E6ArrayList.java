package Review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");

        ArrayList<String> feeDafaulter=new ArrayList<>();
        feeDafaulter.add("Axel");
        feeDafaulter.add("Farwa");
        feeDafaulter.add("Adam");
        feeDafaulter.add("Leandro");
        student.removeAll(feeDafaulter);
        System.out.println(student);
    }
        }
