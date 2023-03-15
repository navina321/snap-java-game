package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
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

    public Card dealCard(){
        Card topCard = deckOfCards.get(0);
        deckOfCards.remove(0);
        discardPile.add(topCard);
        return topCard;
    }

    public ArrayList<Card> sortDeckInNumberOrder(){
        Collections.sort(deckOfCards, Comparator.comparing(Card::getValue));
        return deckOfCards;
    }
    public ArrayList<Card> sortDeckIntoSuits(){
        Collections.sort(deckOfCards, Comparator.comparing(Card::getSuit));
        return deckOfCards;
    }

    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
