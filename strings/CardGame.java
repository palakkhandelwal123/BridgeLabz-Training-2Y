import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }

        int cardIndex = 0;
        for (int i = 1; i <= players; i++) {
            System.out.print("Player " + i + ": ");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.print(deck[cardIndex++] + ", ");
            }
            System.out.println();
        }
    }
}
