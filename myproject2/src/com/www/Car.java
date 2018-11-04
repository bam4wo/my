package com.www;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter price");
		double price = scanner.nextDouble();
		Ticket q = new Ticket(price);
		Ticket s = new Ticket(price);
		System.out.printf("%.1f price = %.1f quick = %.1f slow",price ,q.quick() ,s.slow());
	}

}
