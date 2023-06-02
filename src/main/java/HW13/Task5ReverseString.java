package HW13;

public class Task5ReverseString {
    // public static void main(String[] args) {

    boolean isPalindrome(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome = true;
        }
        return isStrPalindrome;
    }

    public static void main(String[] args) {
        Task5ReverseString reverseString= new Task5ReverseString();
        boolean result=reverseString.isPalindrome("Madam");
        System.out.println(result);


    }

    //boolean isPalindromeSB(String str) {
    //
    //        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    //    }
}
