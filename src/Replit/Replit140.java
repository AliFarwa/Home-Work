package Replit;

public class Replit140 {
        static String maxLength(String[] arr) {

            String largest = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length()>largest.length()) {
                    largest = arr[i];

                }

            }
            return largest;
        }
        public static void main(String[] args) {
        String[] arr = {"this is long","yolo","hi","hey" ," Hi my name is Farwa"};
        System.out.println(maxLength(arr));
    }
}