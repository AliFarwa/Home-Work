package HW16;

public class Task1 {
//Create a method that will take a String as a parameter and returns reversed String. Method should be available to all
// classes within your project and accessible by class name.
    public String sentence (String a){
        String reversed="";
        for (int i = a.length()-1; i >= 0; i--) {
           reversed=reversed+a.charAt(i);
        }
     return reversed;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        String result= obj.sentence("I Like Java");
        System.out.println(result);
    }
}
