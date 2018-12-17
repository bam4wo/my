package com.tom;

import java.util.Random;

public class Poker {
	Card[] cards = new Card[52];
	
	public Poker() {
		for(int i = 0; i<52; i++) {
			cards[i] = new Card(i);
		}
	}
	
	public void shuffle() {
		for(int i = 0; i<52; i++) {
			int r = new Random().nextInt(52);
			Card tem = cards[i];
			cards[i] = cards[r];
			cards[r] = tem;
		}
	}
	
	public void print() {
		for(int i = 0; i<52; i++) {
			System.out.print(cards[i].get());
			if(i%13 == 12) {
				System.out.println();
			}
		}
	}
}
