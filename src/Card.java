package src;

import java.util.Arrays;

public class Card {
    int cardsInDeck =52;
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    @Override
    public String toString() {
        return "[" +
                Arrays.toString(rank) +
                "of" + Arrays.toString(suit) +
                "]";
    }
}
