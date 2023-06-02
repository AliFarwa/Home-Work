package Review3;

public class ArrayRecap {
    public static void main(String[] args) {

        String[] languages= {"English", "Russina","Turkish", "Urdu"};
        for (String language : languages) {
            System.out.print(language+ " ");
        }
        System.out.println();

        // reverse the elements;
        for (int i = languages.length-1; i>=0 ;i--) {
            System.out.print(languages[i] + " ");
            
        }

            }

        }

