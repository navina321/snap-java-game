# snap-java-game

Project Description: 
create the card game Snap using Java language, the game should utilise classes, ArrayLists and methods.

Classes: CardGame, Card, CardUtils, Snap, Main

CardGame:
* contains arrayList<Card> deckOfCards which is created and populated when the game is constructed, should contain 52 cards.
* has name defined in constructor
* has getDeck method that lists out the cards
* method dealCard: takes and returns top card from deck
* method sortDeckbyValue: sorts the deck by value in ascending order
* method sortDeckbySuit: sorts deck by suit then value
* methods shuffleDeck: returns deckOfCards in random order

* CardUtils:
* contains String array of suits
* contains String array of symbols
* contains Int array of value

Card:
* has constructor using CardUtils
* has getters for suit and value
* has toString method to describe class - returns symbol of suit

Snap: 
* method playSnap: to start playing game by pressing enter, cards are dealt until two cards with same value are dealt consecutively
* overwrite dealCard method to move deal card to discard pile and set as previous card
* add method to compare cards to see if they have same value
* method to start game - welcome message/game rules
* 
