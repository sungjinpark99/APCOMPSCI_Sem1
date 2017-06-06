/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Spades", "6", 6);
		Card card2 = new Card("Spades", "6", 6);
		Card card3 = new Card("Diamonds", "Jack", 11);
		
		System.out.println(card1.rank());
		System.out.println(card1.suit());
		System.out.println(card1.pointValue());
		if (eightofspades.matches(card2))
			System.out.println("Cards match!");
		System.out.println(card3);
}
