package com.tom;

public class Pg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card[] c = new Card[10];
		c[0] = new Card(45);
		System.out.println(c[0].get());
		P p = new P();
		//p.shuffle();
		p.print();
	}

}
