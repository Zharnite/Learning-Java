/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Spades", 1);
		System.out.println(card1);
		Card card2 = new Card("Ace", "Spades", 1);
		Card card3 = new Card("Ace", "Hearts", 1);
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println("rank: " + card2.rank());
		System.out.println("suit: " + card2.suit());
		System.out.println("point value: " + card2.pointValue());
		
	}
}
