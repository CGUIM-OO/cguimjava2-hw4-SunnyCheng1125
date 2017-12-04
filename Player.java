import java.util.ArrayList;

public class Player {
	
	private String name; //	Player's name
	private int chips;   // Player's chips
	private int bet;     // Player's bet in this time
	private ArrayList<Card> oneRoundCard; // The cards Player's holding.
	
	public Player(String name, int chips)  // The constructor of Player.
	{
		this.name=name; // Overload
		this.chips=chips; // Overload
	}
	public String getName() // Get the Player's name
	{
		return name;
	}
	public int makeBet() // Make a basic bet number
	{
		bet=1;
		return bet;
	}
	public void setOneRoundCard(ArrayList cards) //	Import all cards that player got from Deck.
	{
		oneRoundCard=cards;
	}
	public boolean hitMe() // If sum of the cards number over 16, get one more card, otherwise, pass.
	{
		if(getTotalValue()<=16)
			return true;
		else
			return false;
	}
	public int getTotalValue() // Summerize the cards number that player got.
	{
		int totalValue = 0;
		for (Card c : oneRoundCard)
		{
			totalValue += c.getRank();
		}
		return totalValue;
	}
	public int getCurrentChips() //	Return player's latest chips
	{
		return chips;
	}
	public void increaseChips (int diff) //	Change player's current chips, accroding to the result of game.
	{
		bet=diff;
		chips=chips+bet;
	}
	public void sayHello() //Player greeting
	{
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
