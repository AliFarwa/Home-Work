package HW26;

import java.util.LinkedHashSet;
import java.util.Set;

public class Concat {
    public static void main(String[] args) {

        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        Set<String> objects = new LinkedHashSet<>();
        objects.add("Its");
        objects.add("raining");
        objects.add("today");
        objects.add("with");
        objects.add("lihgtening");
        for (String object : objects) {
            System.out.print(object.concat(" "));
        }
    }
}
