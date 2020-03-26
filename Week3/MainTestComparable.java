package Week3;

public class MainTestComparable {
	public static void main(String[] args) {
		Card[] cards = { new Card(7, "Ro"), new Card(3, "Co"), new Card(4, "Bich"), new Card(3, "Tep") };
		for (Card card : cards) {
			card.setSuit("" + card.convertSuitToInt(card.getSuit()));
		}
		SimpleSorting<Card> simpleSorting = new SimpleSorting<Card>();
		simpleSorting.bubbleSort(cards, cards.length);
		for (Card card : cards) {
			System.out.println(card);
		}
	}
}
