package poker;

import static org.junit.Assert.*;


import org.junit.Test;

public class StudentTests {



	@Test
	public void studentTestHasPair() {
		
		Card[] test = new Card[5];
		
		test[0] = new Card(4, 2);
		test[1] = new Card(2, 1);
		test[2] = new Card(5, 3);
		test[3] = new Card(2, 0);
		test[4] = new Card(1, 0);
		
		assertTrue(PokerHandEvaluator.hasPair(test));
		
		
		
	}
	
	@Test
	public void studentTestHasTwoPair() {
		
		Card[] test = new Card[5];
		
		test[0] = new Card(1, 2);
		test[1] = new Card(1, 1);
		test[2] = new Card(4, 3);
		test[3] = new Card(4, 2);
		test[4] = new Card(1, 0);
		
		assertTrue(PokerHandEvaluator.hasTwoPair(test));
		
		
		
	}
	
	@Test
	public void studentTestHasThreeOfAKind() {
		
		Card[] test = new Card[5];
		
		test[0] = new Card(1, 2);
		test[1] = new Card(1, 1);
		test[2] = new Card(7, 3);
		test[3] = new Card(1, 2);
		test[4] = new Card(9, 0);
		
		assertTrue(PokerHandEvaluator.hasThreeOfAKind(test));
		
		
	}
	
	@Test
	public void studentTestHasStraight() {
		
		Card[] test = new Card[5];
		
		test[0] = new Card(12, 2);
		test[1] = new Card(11, 1);
		test[2] = new Card(10, 3);
		test[3] = new Card(13, 2);
		test[4] = new Card(1, 0);
		
		assertTrue(PokerHandEvaluator.hasStraight(test));
		
		
		
	}
	
	@Test
	public void studentTestHasFlush() {
	
		Card[] test = new Card[5];
		
		test[0] = new Card(1, 2);
		test[1] = new Card(4, 2);
		test[2] = new Card(7, 2);
		test[3] = new Card(9, 2);
		test[4] = new Card(13, 2);
		
		assertTrue(PokerHandEvaluator.hasFlush(test));
		
		
		
		
	}
	
	
	@Test
	public void studentTestHasFullHouse() {
	
		
		Card[] test = new Card[5];
		
		test[0] = new Card(1, 2);
		test[1] = new Card(4, 1);
		test[2] = new Card(4, 3);
		test[3] = new Card(1, 2);
		test[4] = new Card(4, 0);
		
		assertTrue(PokerHandEvaluator.hasFullHouse(test));
		
		
		
		
		
	}
	
	@Test
	public void studentTestHasFourOfAKind() {
		
		
		Card[] test = new Card[5];
		
		test[0] = new Card(1, 2);
		test[1] = new Card(1, 1);
		test[2] = new Card(9, 3);
		test[3] = new Card(1, 2);
		test[4] = new Card(1, 0);
		
		assertTrue(PokerHandEvaluator.hasFourOfAKind(test));
		
		
		
		
		
	}
	
	
	@Test
	public void studentTestHasStraightFlush() {
		
		Card[] test = new Card[5];
		
		test[0] = new Card(3, 2);
		test[1] = new Card(4, 2);
		test[2] = new Card(5, 2);
		test[3] = new Card(6, 2);
		test[4] = new Card(7, 2);
		
		assertTrue(PokerHandEvaluator.hasStraightFlush(test));
		
		
		
	}
	
	
	public int throwDie() {
		int value = (int)Math.random()*6+1;
		
		double value1 = (Math.random()*150)+200;
		
		int value2 = (int)(Math.random()*23+1)+55;
		
		return value;
	}
	
	
	
	
	
	
}