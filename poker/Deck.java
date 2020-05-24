package poker;

public class Deck {

	private Card[] cards;

	public Deck() {

		cards = new Card[52];

		for (int i = 0; i < cards.length; i++) {

			int x = (i + 1) % 13;
			if (x == 0) {

				x = 13;
			}

			cards[i] = new Card(x, i / 13);

		}

	}

	public Deck(Deck other) {
		
		//COPY CONSTRUCTOR

		cards = new Card[other.cards.length];

		for (int i = 0; i < cards.length; ++i) {

			cards[i] = other.cards[i];
		}

	}

	public Card getCardAt(int position) {

		int value = cards[position].getValue();
		int suit = cards[position].getSuit();

		Card x = new Card(value, suit);

		return x;
	}

	public int getNumCards() {
		return cards.length;
	}

	public void shuffle() {

		Card[] top;
		if (cards.length % 2 == 0) {
			top = new Card[cards.length / 2];
		} else {
			top = new Card[(cards.length / 2) + 1];
		}

		for (int i = 0; i < top.length; i++) {
			top[i] = cards[i];
		}

		Card[] bottom = new Card[cards.length / 2];
		int count = top.length;

		for (int i = 0; i < bottom.length; i++) {
			bottom[i] = cards[count];
			count++;
		}

		int x = 0;
		int y = 0;

		for (int i = 0; i < cards.length; i++) {
			if (i % 2 == 0) {
				cards[i] = top[x];
				x++;
			} else {
				cards[i] = bottom[y];
				y++;
			}
		}

	}

	public void cut(int position) {

		Card[] top = new Card[position];
		for (int i = 0; i < top.length; i++) {
			top[i] = cards[i];
		}

		Card[] bottom = new Card[cards.length - top.length];
		int count = position;
		for (int i = 0; i < bottom.length; i++) {
			bottom[i] = cards[count];
			count++;
		}

		int x = 0;
		for (int i = 0; i < cards.length; i++) {
			if (i < bottom.length) {
				cards[i] = bottom[i];
			} else {
				cards[i] = top[x];
				x++;
			}
		}

	}

	public Card[] deal(int numCards) {

		Card[] dealt = new Card[numCards];
		for (int i = 0; i < dealt.length; i++) {
			dealt[i] = cards[i];
		}

		Card[] shorter = new Card[cards.length - numCards];
		for (int i = 0; i < shorter.length; i++) {
			shorter[i] = cards[numCards];
			numCards++;
		}

		cards = new Card[shorter.length];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = shorter[i];
		}

		return dealt;
	}

}
