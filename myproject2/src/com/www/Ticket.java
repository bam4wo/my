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
	int ticket;
	int rticket; 
	int all;
	
	public Ticket(int ticket , int rticket , int all){
		this.ticket = ticket;
		this.rticket = rticket;
		this.all = all;
		rticket = all - ticket;
	}
	
	public double total() {
		double total = 1000*ticket + 2000*0.9f*rticket;
		return total;
	}
}
