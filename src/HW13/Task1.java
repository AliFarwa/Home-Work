package HW13;



public class Task1 {
    public static void main(String[] args) {
       // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String input="This is sentence i want to reverse";
        String [] sen =input.split("[ ]");
        for (int j = 0; j < sen.length; j++) {
            for (int i = sen[j].length()-1; i >=0 ; i--) {
                System.out.print(sen[j].charAt(i)+ "");
            }
         System.out.print(" ");
        }




    }
}

