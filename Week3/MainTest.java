package Week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MainTest {

	public static void main(String[] args) {
		Card[] cards = { new Card(2, "Ro"), new Card(3, "Co"), new Card(4, "Bich"), new Card(3, "Tep") };
		Comparator<Card> card = new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2) {
				// TODO Auto-generated method stub
				if (o1.getRank() > o2.getRank()) {
					return 1;
				} else if (o1.getRank() < o2.getRank()) {
					return -1;
				} else {
					if (o1.getSuit().compareTo(o2.getSuit()) > 0) {
						return 1;
					} else if (o1.getSuit().compareTo(o2.getSuit()) < 0) {
						return -1;
					} else {
						return 0;
					}
				}

			}
		};
		Arrays.sort(cards, card);
		Stream.of(cards).forEach(System.out::println);
	}
}
