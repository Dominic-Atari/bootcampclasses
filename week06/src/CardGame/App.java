package bootcampClasses.week06.src.CardGame;

public class App {

	public static void main(String[] args) {
		// Create a new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Create two new players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // cards to each player
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // rounds of game
        for (int i = 0; i < 26; i++) {
            // Flip a card from each player's hand
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // Print flip cards
            System.out.println(player1.getName() + " plays: ");
            card1.describe();
            System.out.println(player2.getName() + " plays: ");
            card2.describe();

            // Determine the winner of the round
            if (card1.getValue() > card2.getValue()) {
                player1.increaseScore();//***********
                System.out.println(player1.getName() + " wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.increaseScore();//***********
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a draw game");
                
            }
            
        }

	}

}