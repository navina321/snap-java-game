package src;

import java.util.ArrayList;

public class CardGame extends Card{
    public static int cardsInDeck = 52;
    public static ArrayList<String> cards = new ArrayList<>();

    public CardGame(ArrayList<String> cards) {
        this.cards = cards;
    }

    public static void getDeck(){
        System.out.println(cards);
    }
}
