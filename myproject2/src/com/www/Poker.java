package com.www;

public class Poker {
	Card[] card = new Card[52];
	
	public Poker() {
		for(int i=0; i<52; i++) {
			card[i] = new Card(i);
		}
	}
	
	public void print() {
		for(int i=0; i<52; i++) {
			System.out.print(card[i].get());
			if(i%13 == 12) {
				System.out.println();
			}
		}
	}
	
	/*int[] cards = new int[52];
	
	public void print() {
		for(int i=0; i<52; i++) {
			int flower=cards[i]/13;
			char c = 0;
			switch(flower) {
			case 0:
				c = 'C';
				break;
			case 1:
			    c = 'D';
			    break;
			case 2:
				c = 'S';
				break;
			case 3:
				c = 'H';
				break;
			}
			System.out.println(c);
		}
	}*/
}
