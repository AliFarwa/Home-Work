package HW26;

import java.util.HashMap;
import java.util.Map;

public class Integars {
    public static void main(String[] args) {
        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers
        Map<Integer, Integer> num = new HashMap<>();
        num.put(20,60);
        num.put(51,24);
        num.put(32,42);
        num.put(82,95);

        int sum=0;
        for (var numb: num.entrySet()) {
            sum +=numb.getKey() + numb.getValue();
        }
        System.out.println("The sum of the Integar Map is :" +sum);
    }
}
