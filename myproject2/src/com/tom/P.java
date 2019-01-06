package com.tom;

import java.util.Random;

public class P {
	Card[] card = new Card[52];
	
	public P() {
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
	
	public void shuffle() {
		for(int i=0; i<52; i++) {
			int a = new Random().nextInt(52);
			Card tem = card[a];
			card[a] = card[i];
			card[i] = tem;
		}
	}
}
