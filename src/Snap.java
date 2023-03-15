package src;

import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    public boolean playGame = true;
    public Snap(String name) {
        super(name);
    }

    public void startGame() {
        String enter = scanner.nextLine();
        while (playGame){
            shuffleDeck();
            for (int i = 0; i < shuffleDeck().size(); i++) {
                dealCard();
                if(dealCard()==discardPile().get(0)){
                    System.out.println("Congratulations! You Win!");
                } else if (dealCard()!=discardPile().get(0)){
                    dealCard();
                } else if (shuffleDeck().size()==0 && discardPile().size()==52) {
                    shuffleDeck();
                } else {
                    System.out.println("Game Over!");
                }
            }
        }
    }

}
