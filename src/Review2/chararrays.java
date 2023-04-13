package Review2;

public class chararrays {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'b') {
                System.out.println(letters[i]);
            }

        }

        char[] letters2 = new char[4];
        char var = 'a';


        for (int i = 0; i < letters2.length; i++) {

            letters2[i] = var;
            var++;
        }

        for (char letter : letters2) {
            if (letter == 'b')
                System.out.println(letter);

        }

    }
}
