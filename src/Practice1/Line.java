package Practice1;

public class Line {
     String newLine(String sentence){
         for (int i = 1; i <=3 ; i++) {
             System.out.println(sentence);

         }
         return sentence;
     }

    public static void main(String[] args) {

         Line obj=new Line();
         obj.newLine("newLine method implementation");
    }


}
