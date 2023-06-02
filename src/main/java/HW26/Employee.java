package HW26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format
//John Smith=$100000
        int higestpay=0;
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Meghn", 2500);
        employee.put("Chelsea", 3000);
        employee.put("John Smith", 100000);

        for (var e : employee.entrySet()) {
            if (e.getValue() > higestpay) {
                higestpay=e.getValue();
                System.out.println(e.getKey()+ "=" +higestpay);
            }

        }

    }
}