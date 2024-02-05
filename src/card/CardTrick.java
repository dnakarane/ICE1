package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; // Values from 1 to 13
            String suit = Card.SUITS[random.nextInt(4)]; // Suits from the predefined SUITS array
            magicHand[i] = new Card(value, suit);
        }

        // Print out the magic hand
        for (Card card : magicHand) {
            System.out.println(card);
        }

        // Ask the user for a card value
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        // Ask the user for a suit using numbers
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = scanner.nextInt();
        // Validate the suit index
        if (userSuitIndex < 0 || userSuitIndex > 3) {
            System.out.println("Invalid suit number entered. Please enter a number between 0 and 3.");
            scanner.close();
            return;
        }
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card(userValue, userSuit);

        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        scanner.close();
    }
}