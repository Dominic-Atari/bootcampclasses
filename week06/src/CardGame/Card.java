package CardGame;

public class Card {
	private int value;
	private String name;
	
	 //constructor that takes values from the card class
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	//method for getters and setters.
	//getter
	public int getValue() {
		return value;
	}
	//setter
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
		
	}
	//describe method
	public void describe() {
		System.out.println(name);
	}
}
