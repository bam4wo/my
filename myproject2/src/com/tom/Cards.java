package com.tom;

public class Cards {
	char[] suits = {'\u2660','\u2665','\u2666','\u2663'};
	int value;
	
	public Cards(int value) {
		this.value = value;
	}
	
	public String get() {
		String a = value%13+1 + " " + suits[value/13];
		return a;
	}
}
