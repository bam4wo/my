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
	
    /*int ticket ;
	
	public Ticket(int ticket){
		this.ticket = ticket;
	}
	
	public int singal(){
		int singal = 1000*ticket;
		return singal;
	}
	
	public int two(){
		int two = (2000)*9/10*ticket;
		return two;
	}*/
	int pricet = 1000;
	boolean rticket;
	public Ticket(boolean rticket) {
		this.rticket = rticket;
	}
	
	public int all() {
		int total = pricet;
		if(rticket) {
			total = (int)(pricet*2*0.9f);
		}
		return total;
	}
}	
