package com.www;

public class Ticket {
	double price;
	
	public Ticket(double price) {
		this.price = price;
	}
	
	public double quick() {
		double quick = price*2;
		return quick;
	}
	
	public double slow() {
		double slow = price/2+50;
		return slow;
	}

}
