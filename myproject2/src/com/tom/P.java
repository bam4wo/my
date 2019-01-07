package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class P {
	//Card[] card = new Card[52];
	ArrayList bag = new ArrayList();
	
	public P() {
		for(int i=0; i<52; i++) {
			Card b = new Card(i);
			bag.add(b);
		}
		System.out.println(bag.size());
	}
	
	public void print() {
		for(int i=0; i<52; i++) {
			Card c = (Card) bag.get(i);
			System.out.print(c.get());
			if(i%13 == 12) {
				System.out.println();
			}
		}
	}
	
	/*public void shuffle() {
		for(int i=0; i<52; i++) {
			int a = new Random().nextInt(52);
			Card tem = card[a];
			card[a] = card[i];
			card[i] = tem;
		}
	}*/
}
