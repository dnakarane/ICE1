package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Card luckyCard = new Card(5, "Clubs"); 

        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; 
            String suit = Card.SUITS[random.nextInt(4)]; 
            magicHand[i] = new Card(value, suit);
        }

        for (Card card : magicHand) {
            System.out.println(card);
        }

        System.out.println("The lucky card is " + luckyCard); 
    
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = scanner.nextInt();
        
        if (userSuitIndex < 0 || userSuitIndex > 3) {
            System.out.println("Invalid suit number entered. Please enter a number between 0 and 3.");
            scanner.close();
            return;
        }
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card(userValue, userSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (userCard.getValue() == luckyCard.getValue() && userCard.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
            System.out.println("You've found the lucky card!");
        } else if (found) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        scanner.close();
    }
}
