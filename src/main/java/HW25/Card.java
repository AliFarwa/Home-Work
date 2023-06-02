package HW25;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardTye;

    Card(double interestField, String cardTye) {
        this.interestRate = interestField;
        this.cardTye = cardTye;
    }

    @Override
    public String toString() {
        return "Card{" +
                "interestField=" + interestRate +
                ", cardTye='" + cardTye + '\'' +
                '}';
    }
}

class CardTester{
    public static void main(String[] args) {

        LinkedList<Card> cards= new LinkedList<>();
        cards.add(new Card(20.5,"Credit Card"));
        cards.add(new Card(60.30,"Debit Card"));
        cards.add(new Card(50.0,"Visa card"));
        for (Card card : cards) {
            System.out.println(card.toString());

        }
        for (int i = 0; i <cards.size() ; i++) {
            System.out.println(cards.get(i).toString());
        }
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()){
            Card card=iterator.next();
            System.out.println(card.toString());
        }
    }
}