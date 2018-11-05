package com.www;

public class Ticket {
	double price;
	int hour;
	int minute;
	
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
	public Ticket(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
}
