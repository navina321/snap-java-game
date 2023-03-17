package src;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    public boolean playGame = true;
    private Card currentCard = null;
    private Card previousCard = null;
    private ArrayList<Card> discardPile = new ArrayList<>();
    public Snap(String name) {
        super(name);
    }
    public ArrayList<Card> discardPile() {
        return discardPile;
    }

    public void startGame(){
        System.out.println("Let's play Snap!");
        System.out.println("If you get two cards with the same symbol i.e 2 Jacks or 2 Aces, you win");
        String startSnapGame = scanner.nextLine();
        System.out.println("Press Enter to start!");
        if(Objects.equals(startSnapGame,"")){
            System.out.println("Starting game...");
        }
    }

    @Override
    public Card dealCard() {
        currentCard = getDeckOfCards().get(0);
        getDeckOfCards().remove(0);
        discardPile.add(currentCard);
        previousCard = discardPile.get(discardPile().size()-1);
        return currentCard;
    }
    public void printDealtCards(){
        if(previousCard != null){
            System.out.println(previousCard);
           // System.out.println(currentCard);
        } else {
            System.out.println(currentCard);
        }
    }

    public void compareCards (Card cardOne,Card cardTwo){
        if(cardOne.getValue() == cardTwo.getValue()){
            System.out.println(previousCard);
            System.out.println("Snap!");
            playGame = false;
        }
    }

    public void playSnap(){
        shuffleDeck();
        dealCard();
        printDealtCards();
        String dealNewCard = scanner.nextLine();

        while(playGame){
            shuffleDeck();
            dealCard();
            printDealtCards();
            compareCards(currentCard, previousCard);
            System.out.println("Press enter");
            dealNewCard = scanner.nextLine();
        }
    }
}
