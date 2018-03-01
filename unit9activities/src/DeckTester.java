/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
	private static String[] Suits = {"Diamonds", "Clubs", "Hearts" ,"Spades"};
	private static String[] Ranks = {"2", "3", "4" ,"5","6", "7", "8" ,"9", "10", "Jack" ,"Queen", "King", "Ace" };
	private static int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(Ranks, Suits, pointValues);
		test.toString();
	}
}
