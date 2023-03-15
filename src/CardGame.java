package src;

import java.util.ArrayList;

public class CardGame {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    {
        populateDeck();
    }

    public CardGame(String name) {
        this.name = name;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void populateDeck(){
        for (int i = 0; i < CardUtils.symbols.length; i++) {
            Card clubCard = new Card(CardUtils.suits[0],CardUtils.symbols[i],CardUtils.values[i]);
            Card diamondCard = new Card(CardUtils.suits[1],CardUtils.symbols[i],CardUtils.values[i]);
            Card heartCard = new Card(CardUtils.suits[2],CardUtils.symbols[i],CardUtils.values[i]);
            Card spadeCard = new Card(CardUtils.suits[3],CardUtils.symbols[i],CardUtils.values[i]);
            deckOfCards.add(clubCard);
            deckOfCards.add(diamondCard);
            deckOfCards.add(heartCard);
            deckOfCards.add(spadeCard);
        }
        System.out.println(deckOfCards);
    }

}
