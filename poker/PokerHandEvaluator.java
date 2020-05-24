package poker;

public class PokerHandEvaluator {

	public static boolean hasPair(Card[] cards) {

		for (int i = 1; i < cards.length; i++) {
			if (cards[0].getValue() == cards[i].getValue()) {
				return true;
			}
		}

		for (int i = cards.length - 2; i >= 0; i--) {
			if (cards[cards.length - 1].getValue() == cards[i].getValue()) 
			{
				return true;
			}
		}

		if (cards[1].getValue() == cards[3].getValue() || cards[1].
				getValue() == cards[2].getValue()
				|| cards[2].getValue() == cards[3].getValue()) {
			return true;
		}

		return false;

	}

	public static boolean hasTwoPair(Card[] cards) { //FIGURE OUT MORE EFFICIENT WAY

		int[] check = new int[4];

		for (int i = 1; i < cards.length; i++) {
			if (cards[0].getValue() == cards[i].getValue()) {
				check[0] = cards[0].getValue();
				break;
			}

		}

		for (int i = 2; i < cards.length; i++) {
			if (cards[1].getValue() == cards[i].getValue()) {
				check[1] = cards[1].getValue();
				break;
			}

		}

		for (int i = 3; i < cards.length; i++) {
			if (cards[2].getValue() == cards[i].getValue()) {
				check[2] = cards[2].getValue();
				break;
			}

		}

		if (cards[3].getValue() == cards[4].getValue()) {
			check[3] = cards[3].getValue();
		}

		for (int i = 1; i < check.length; i++) {

			if (check[0] != 0) {
				if (check[0] != check[i] && check[i] != 0) {
					return true;
				}
			}
		}

		for (int i = check.length - 2; i >= 0; i--) {

			if (check[check.length - 1] != 0) {
				if (check[check.length - 1] != check[i] && check[i] != 0) {
					return true;
				}

			}
		}

		return false;

	}

	public static boolean hasThreeOfAKind(Card[] cards) {

		for (int i = 0; i < cards.length - 1; i++) {
			for (int card1 = i + 1; card1 < cards.length; card1++) {
				for (int card2 = card1 + 1; card2 < cards.length; card2++)
				{
					if (cards[card1].getValue() == cards[i].getValue()
							&& cards[card2].getValue() == cards[card1].
							getValue()) {
						return true;
					}
				}
			}
		}

		return false;

	}

	public static boolean hasStraight(Card[] cards) {

		boolean values[] = new boolean[14];
		for (int index = 0; index < cards.length; index++) {
			values[cards[index].getValue()] = true;
		}

		for (int index = 1; index + 4 < 14; index++) {
			if (values[index] == true && values[index + 1] == true && 
					values[index + 2] == true
					&& values[index + 3] == true && values[index + 4] == 
					true) {
				return true;
			}
		}

		if (values[1] == true && values[10] == true && values[11] == true
				&& values[12] == true && values[13] == true) {
			return true;
		}

		return false;

	}

	public static boolean hasFlush(Card[] cards) {

		int count = 0;
		int cardSuit = cards[0].getSuit();
		for (int index = 1; index < cards.length; index++) {
			if (cardSuit == cards[index].getSuit()) {
				count++;
			}

			if (count == 4) {
				return true;
			}
		}

		return false;

	}

	public static boolean hasFullHouse(Card[] cards) {

		if (hasThreeOfAKind(cards) && hasTwoPair(cards)) {
			return true;
		}

		return false;

	}

	public static boolean hasFourOfAKind(Card[] cards) {

		int count1 = 0;

		for (int i = 1; i < cards.length; i++) {
			if (cards[0].getValue() == cards[i].getValue()) {
				count1++;
			}
		}

		int count2 = 0;

		for (int i = cards.length - 2; i >= 0; i--) {
			if (cards[cards.length - 1].getValue() == cards[i].getValue()) {
				count2++;
			}
		}

		if (count1 == 3 || count2 == 3) {
			return true;
		}

		return false;

	}

	public static boolean hasStraightFlush(Card[] cards) {

		if (hasStraight(cards) && hasFlush(cards)) {
			return true;
		}

		return false;
	}
}
