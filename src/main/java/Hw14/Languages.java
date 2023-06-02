package Hw14;

public class Languages {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.

         void Languages (String country){
             if(country.equals("Pakistan")){
                 System.out.println("Sallam");
             } else if (country.equals("USA")) {
                 System.out.println("Hello");
             } else if (country.equals("Spain")) {
                 System.out.println("Hola");

             }else {
                 System.out.println("Language not specified");
             }
         }

    public static void main(String[] args) {
        Languages obj=new Languages();
             obj.Languages("Pakistan");
             obj.Languages("Spain");
             obj.Languages("USA");
    }
}

