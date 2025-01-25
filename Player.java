package bootcampClasses;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> has;
	private int score;
	private String name;
	
	//constructors.
	public Player(String name) {
		this.name = name;
		has = new ArrayList<>();
		score = 0;
	}
	//method to call.
	public void describe() {
		System.out.println("Player name = " + name);
		System.out.println("Scored = " + score);
		System.out.println("Card'(s) in hand = ");
		for (Card card : has) {
			card.describe();
		}

	}
	//methods to flip card from a player(has).
	public Card flip() {
		return this.has.remove(0);
		
	}
    // method to draw and add cards to a player (has).
	public void draw(Deck deck) {
		this.has.add(deck.draw());
	}
	// method to increase players score.
	public void increaseScore() {
		this.score++;
		
	}
	// Getters for players score and name
	
	public String getName() {
        return this.name;
        
	}
    public int getScore() {
        return this.score;
    
    }
}

