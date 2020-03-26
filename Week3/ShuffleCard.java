package Week3;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleCard {
	final int size = 52;
	Card[] deckOfCards = new Card[size];

	public ShuffleCard() {
		int count = 0;
		String[] suits = { "Ro", "Co", "Bich", "Tep" };
		int[] ranks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		for (String s : suits) {
			for (int r : ranks) {
				Card card = new Card(r, s);
				this.deckOfCards[count] = card;
				count++;
			}
		}
	}

	public void ShuffleCards() {
		Random rand = new Random();
		int j;
		for (int i = 0; i < size; i++) {
			j = rand.nextInt(52);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
	}
	public void showCards(){
        System.out.println("---------------------------------------------");
        int count =0;
        for (Card card : deckOfCards){
            System.out.print(card.getRank() + card.getSuit() + "     ");
            count++;
            if(count%4==0)
                System.out.println("");
        }
        System.out.println("---------------------------------------------");
    }
	public static void main(String[] args) {
		ShuffleCard deck = new ShuffleCard();
        System.out.println("UnShuffeled Cards.");
        deck.showCards();
        deck.ShuffleCards();
        System.out.println("Shuffeled Cards.");
        deck.showCards();
	}
}
