package Review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).contains("a")) {
                System.out.println(arrayList.get(i));// to get elements one by one

            }
        }
    }
}