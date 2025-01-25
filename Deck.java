package bootcampClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for(String suit : suits) {
            for(int i = 0; i < ranks.length ; i++) {
                Card card = new Card(i + 1, ranks[i]+ " of " + suit);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
public Card draw() {
	return cards.remove(0);
	
	}

	
}
