package Practice1;

class Main {

    String censorletter(String word, char character) {
        word.replaceAll("e", "*");
        word.replaceAll("t", "*");
        return word;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String output=obj.censorletter("computer science", '*');
        System.out.println(output);

        String output2=obj.censorletter("trick o treat",'*');
        System.out.println(output2);
    }
}



