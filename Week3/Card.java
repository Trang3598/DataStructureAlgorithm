package Week3;

import java.util.Comparator;

public class Card implements Comparable<Card> {
	private int rank;
	private String suit;

	public Card(int rank, String suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int convertRankToInt(String rank) {
		int result = 0;
		int temp = Integer.parseInt(rank);
		switch (rank) {
		case "J":
			result = 11;
			break;
		case "Q":
			result = 12;
			break;
		case "K":
			result = 13;
			break;
		case "A":
			result = 1;
			break;

		default:
			break;
		}
		return result;
	}

	public int convertSuitToInt(String suit) {
		int result = 0;
		switch (suit) {
		case "Co":
			result = 4;
			break;
		case "Ro":
			result = 3;
			break;
		case "Tep":
			result = 2;
			break;
		case "Bich":
			result = 1;
			break;

		default:
			break;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		if (this.rank > o.getRank()) {
			return 1;
		} else if (this.rank < o.getRank()) {
			return -1;
		} else {
			if (this.suit.compareTo(o.getSuit()) > 0) {
				return 1;
			} else if (this.suit.compareTo(o.getSuit()) < 0) {
				return -1;
			} else {
				return 0;
			}
		}

	}

	class CompareCard implements Comparator<Card> {
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
	}
}
