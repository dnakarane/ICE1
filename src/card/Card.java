package card;

/**
 * A class that models playing card objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * and a suit (hearts, diamonds, clubs, spades).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 */
public class Card {

    private String suit; // clubs, spades, diamonds, hearts
    private int value;   // 1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // Constructor
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}