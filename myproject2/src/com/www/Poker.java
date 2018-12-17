package com.www;


public class Poker {
	Card[] cards = new Card[52];
	
	public Poker() {
		for(int i = 0; i<52; i++) {
			cards[i] = new Card(i);
		}
	}
	
	/*public void print() {
		for(int i = 0; i<52; i++) {
			int flower = cards[i]/13;
			char c = 0;
			switch(flower) {
			case 0:
				c = 'S';
				break;
			case 1:
				c = 'H';
				break;
			case 2:
				c = 'D';
				break;
			case 3:
				c = 'C';
				break;
			
		}
		System.out.print((i/13+1) +""+ c + " ");
		
		if (i%13 == 12)
			System.out.println();
		}
	}*/
}
