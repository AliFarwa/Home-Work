package Review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        System.out.println(arrayList);

for(String arr :arrayList){
    if (arr.contains("a")){
        System.out.println(arr);
    }
}


            }
        }
